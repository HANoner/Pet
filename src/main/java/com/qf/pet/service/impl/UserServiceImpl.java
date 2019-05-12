package com.qf.pet.service.impl;

import com.alibaba.fastjson.JSON;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.pet.common.util.*;
import com.qf.pet.common.vo.ResultVO;
import com.qf.pet.common.vo.TokenVO;
import com.qf.pet.entity.User;
import com.qf.pet.mapper.UserDao;
import com.qf.pet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wsy
 * @since 2019-05-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
	@Autowired
    private UserDao userDao;
    @Autowired
    private JedisUtil jedisUtil;
    @Override
    public ResultVO sendMsgCode(String phone) {

        User user = userDao.selectOne(new QueryWrapper<User>().eq("userphone", phone));
        if (user != null && user.getUserphone().equals(phone)) {
            return ResultUtil.exec(false, "该手机号已注册过", null);
        } else {
            int code = RandomUtil.createNum(6);
            boolean b = AliyunSmsUtil.sendSms(phone, code);
            jedisUtil.setStr("msgcode",Integer.toString(code),180);
            //session.setAttribute("msgcode",Integer.toString(code));
            return ResultUtil.exec(b, "验证码",code);
        }
    }

    @Override
    public ResultVO register(String name,String phone,String code,String password){
	    User user = new User();
	    user.setUsername(name);
	    user.setUserpassword(password);
	    user.setUserphone(phone);

        String  msgcode = jedisUtil.getStr("msgcode");
        User u = userDao.selectOne(new QueryWrapper<>(user).eq("userphone", phone));
        if (msgcode == null && msgcode == "") {
            return ResultUtil.setERROR("验证码已过期，请重新发送");
        }else if (u != null){
            return ResultUtil.setERROR("该手机号已经注册过");
        }else if (!msgcode.equals(code)){
            return ResultUtil.exec(false, "验证码错误", null);
        }else {
            return ResultUtil.exec(userDao.insert(user) >= 1, "注册成功", null);

        }
    }

    @Override
    public ResultVO login(String phone, String password,HttpServletResponse response) {
        User user = userDao.selectOne(new QueryWrapper<User>().eq("userphone", phone));
        if ( user != null && user.getUserphone().equals(phone) && user.getUserpassword() .equals(password)){

           // String token = EncryptionUtil.AESEnc(SystemConst.TOKENKEY, JSON.toJSONString(user));
            String token = TokenUtil.createToken(user.getId(), phone);

            //把用户信息放入redies里面
            jedisUtil.setStr("usertoken"+ user.getId(),JSON.toJSONString(user),1800);

            //cookie 里面保存的是用户id和用户的手机号码
            Cookie c = new Cookie("usertoken",token);
            response.addCookie(c);
            return ResultUtil.exec(true,"登陆成功",null);
        }else {
            return ResultUtil.exec(false,"用户名或密码不正确",null);
        }

    }

    @Override
    public ResultVO logout(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        String token = "";
        for (Cookie c:cookies) {
               if (c.getName().equals("usertoken")){
                   token = c.getValue();
               }
        }
        TokenVO tokenVO = TokenUtil.parseToken(token);
        jedisUtil.delKey("usertoken"+tokenVO.getUid());
        //删除Cookie
        Cookie cookie=new Cookie("usertoken","");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        return ResultUtil.setOK("注销成功");
    }

    @Override
    public ResultVO findLosePwd(String phone, String pwd, String code) {
        String msgcode = jedisUtil.getStr("findpwdcode");
        User user = userDao.selectOne(new QueryWrapper<User>().eq("userphone", phone));
        if (user == null){
            return ResultUtil.setERROR("该用户不存在，请检查手机号是否输入正确");
        }else if (msgcode == null && msgcode == "" ){
            return ResultUtil.setERROR("验证码已过期，请重新发送");
        }else if(!msgcode.equals(code)){
            return ResultUtil.setERROR("验证码错误");
        }else {
            return ResultUtil.exec(userDao.updateUserPwd(pwd,phone)>1,"修改密码成功",null);
        }

    }

    @Override
    public ResultVO findpwdCode(String phone) {
        User user = userDao.selectOne(new QueryWrapper<User>().eq("userphone", phone));
        if (user == null) {
            return ResultUtil.setERROR("该手机号还没有注册，不能找回密码");
        } else {
            int code = RandomUtil.createNum(6);
            boolean b = AliyunSmsUtil.sendSms(phone, code);
            jedisUtil.setStr("findpwdcode", JSON.toJSONString(code), 180);
            return ResultUtil.exec(b, "发送成功,三分钟内有效", code);
        }


    }


}

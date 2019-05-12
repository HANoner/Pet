package com.qf.pet.web;

import com.qf.pet.common.vo.ResultVO;
import com.qf.pet.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wsy
 * @since 2019-05-04
 */
@RestController
@Api(value = "用户账户的相关操作",tags = "操作用户账户")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("user/codemsg")
    @ApiOperation(value = "验证码请求接口",notes = "获取验证码")
    public ResultVO sendMsg(String phone){
        return userService.sendMsgCode(phone);
    }
    @PostMapping("user/register")
    @ApiOperation(value = "用户注册接口",notes = "用户注册接口")
    public ResultVO register( String name,String phone, String code,String password){
        return userService.register(name,phone,code,password);
    }

    @PostMapping("user/login.do")
    @ApiOperation(value = "用户登陆",notes = "用户登陆接口")
    public ResultVO login(String phone,String password, HttpServletResponse response){
        return  userService.login(phone,password,response);
    }

    @GetMapping("user/logout.do")
    @ApiOperation(value = "退出登陆",notes = "用户退出登陆接口")
    public ResultVO logout(HttpServletRequest request,HttpServletResponse response){
        return userService.logout(request, response);
    }
    @PostMapping("user/findlosepwd")
    @ApiOperation(value = "找回密码",notes = "用户根据手机短信验证找回密码接口")
    public ResultVO findlosepwd( String phone,String pwd,String code){
        return userService.findLosePwd(phone,pwd,code);
    }
    @GetMapping("user/findpwdCode")
    @ApiOperation(value = "找回密码的验证码接口",notes = "用户找回密码短信接口")
    public ResultVO findpwdCode(String phone){
        return userService.findpwdCode(phone);
    }
}

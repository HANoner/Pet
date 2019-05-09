package com.qf.pet.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qf.pet.common.vo.ResultVO;
import com.qf.pet.entity.User;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wsy
 * @since 2019-05-04
 */
public interface UserService extends IService<User> {
    ResultVO sendMsgCode(String phone);
    ResultVO register(String name,String phone,String code,String password);
    ResultVO login(String phone,String password,HttpServletResponse response);
    ResultVO logout(HttpServletRequest request,HttpServletResponse response);
    ResultVO findLosePwd(String phone,String pwd,String code);
}

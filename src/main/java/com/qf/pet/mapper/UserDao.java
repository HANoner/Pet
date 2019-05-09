package com.qf.pet.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.pet.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author wsy
 * @since 2019-05-04
 */
public interface UserDao extends BaseMapper<User> {
    //@Select("select * from user where userphone = #{phone}")
    @Update("update user set userpassword = #{userpassword} where userphone = #{userphone}")
    int updateUserPwd(@Param("userpassword")String pwd,@Param("userphone") String phone);


}
package com.springbootdubbo.dubbodemo.Mapper;

import com.springbootdubbo.dubbodemo.domain.UserDO;
import org.apache.ibatis.annotations.Param;

/**
 * @author ：jiasanfeng
 * @date ：Created in 2020-06-17 10:20
 */

public interface UserMapper {

    UserDO queryUserByNameAndPhone(@Param("name") String name, @Param("phone") String phone);

    UserDO queryUserByNameAndMail(@Param("name") String name,@Param("mail") String mail);

    UserDO getUserByInnerUserId(@Param("innerUserId") String innerUserId);

    UserDO getUserByMail(@Param("mail") String mail);


    Integer addUserInfo(@Param("userVo") UserDO userVo);

    UserDO getUserInfoById(@Param("id") Long id);

    void updateUserInfo(@Param("id")Long id);
}

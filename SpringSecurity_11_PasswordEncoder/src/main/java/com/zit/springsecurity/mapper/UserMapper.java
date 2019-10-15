package com.zit.springsecurity.mapper;

import com.zit.springsecurity.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    @Select("SELECT * FROM users WHERE username=#{username}")
    User findByUserName(@Param("username") String username);
}

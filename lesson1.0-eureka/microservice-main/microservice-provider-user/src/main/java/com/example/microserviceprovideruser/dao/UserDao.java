package com.example.microserviceprovideruser.dao;


import com.example.microserviceprovideruser.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserDao {

    User getUserById(@Param("id") Long id);

    Boolean getUser(@Param("username") String username, @Param("password") String password);
}

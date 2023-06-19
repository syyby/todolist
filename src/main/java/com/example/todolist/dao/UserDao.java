package com.example.todolist.dao;

import com.example.todolist.pojo.Do.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {
    int getUserInfo(@Param("username") String username , @Param("password") String password);
}


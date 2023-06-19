package com.example.todolist.dao;

import com.example.todolist.pojo.Do.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AdminDao {
    public Admin addAdmin(@Param("username") String username, @Param("password") String password, @Param("email") String email);
}

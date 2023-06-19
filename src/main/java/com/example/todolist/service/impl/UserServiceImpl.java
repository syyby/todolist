package com.example.todolist.service.impl;

import com.example.todolist.dao.UserDao;
import com.example.todolist.pojo.dto.LoginDTO;
import com.example.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Boolean login(LoginDTO logindto) {
        int id=-1;
        id=userDao.getUserInfo(logindto.getUsername(), logindto.getPassword());
        return id >= 1;
    }


}

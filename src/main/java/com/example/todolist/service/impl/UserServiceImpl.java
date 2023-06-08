package com.example.todolist.service.impl;

import com.example.todolist.dao.UserDao;
import com.example.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Boolean login(String username, String password) {
        System.out.println(userDao.getUserInfo(username,password));
        return true;
    }
    public Boolean register(String username,String password, String email)
    {
        System.out.println(userDao.addUser(username,password,email));
        return true;
    }


}

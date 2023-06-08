package com.example.todolist.controller;

import com.example.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public String login(){
        userService.login("用户名","密码");
        return "登陆成功";
    }
    @PostMapping("/register")
    public String register(){
        userService.register("用户名","密码","邮箱");
        return "注册成功";
    }

}

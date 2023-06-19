package com.example.todolist.controller;

import com.example.todolist.service.UserService;
import enums.ResCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.Data;
import com.example.todolist.pojo.dto.AdminDTO;
import com.example.todolist.pojo.dto.AdminDTO2;
import com.example.todolist.pojo.dto.LoginDTO;
import com.example.todolist.pojo.vo.ResVO;
import com.example.todolist.service.AdminService;
@RestController
@RequestMapping
public class UserController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private UserService userService;
    @PostMapping( "/login")
    public ResVO<LoginDTO> login(@RequestBody LoginDTO loginDTO) {
        // 验证数据信息
        //核对用户名密码
        Boolean flag = userService.login(loginDTO);
        if (!flag) {
            return new ResVO<LoginDTO>(1002, "用户名或密码错误", loginDTO);
        }

        //响应请求
        return new ResVO<>(5001, "登录成功", loginDTO);
    }

    @PostMapping( "/register")
    public ResVO<String> addAdmin(@RequestBody AdminDTO2 adminDTO) {
        Boolean flag = false;
        if (adminDTO == null) {
            return new ResVO<>(ResCodeEnum.ADDER.getResCode(), "添加失败", "");
        }

        flag = adminService.addAdmin(adminDTO);

        if (flag) {
            return new ResVO<>(ResCodeEnum.ADDOK.getResCode(), "添加成功", "");
        }
        return new ResVO<>(ResCodeEnum.ADDER.getResCode(), "用户名已存在", "");
    }
}

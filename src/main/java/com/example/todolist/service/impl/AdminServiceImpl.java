package com.example.todolist.service.impl;

import com.example.todolist.dao.AdminDao;
import com.example.todolist.pojo.Do.Admin;
import com.example.todolist.pojo.dto.AdminDTO;
import com.example.todolist.pojo.dto.AdminDTO2;
import com.example.todolist.pojo.dto.LoginDTO;
import com.example.todolist.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminDao adminDao;

    @Override
    public Boolean addAdmin(AdminDTO2 adminDTO2) {
        Admin admin = new Admin();
        admin.setUsername(adminDTO2.getUsername());
        admin.setPassword(adminDTO2.getPassword());
        admin.setEmail(adminDTO2.getEmail());
        System.out.println(adminDao.addAdmin(adminDTO2.getUsername(), adminDTO2.getPassword(), adminDTO2.getEmail()));
        return true;
    }
}

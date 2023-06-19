package com.example.todolist.service;

import com.example.todolist.pojo.Do.Admin;
import com.example.todolist.pojo.dto.AdminDTO;
import com.example.todolist.pojo.dto.AdminDTO2;
import com.example.todolist.pojo.dto.LoginDTO;

public interface AdminService {
    public Boolean addAdmin (AdminDTO2 admin);
}
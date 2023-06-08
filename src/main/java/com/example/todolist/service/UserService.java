package com.example.todolist.service;

public interface UserService {
    Boolean login(String username , String password);
    Boolean register(String username,String password, String email);
}

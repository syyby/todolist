package com.example.todolist.controller;

import com.example.todolist.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
    private TeamService teamService;
    public String CreateTeam(){
        return "新建小组成功";
    }
}

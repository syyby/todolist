package com.example.todolist.dao;

import com.example.todolist.pojo.Do.TeamInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TeamDao {
    TeamInfo getTeamInfo(@Param(""));
}

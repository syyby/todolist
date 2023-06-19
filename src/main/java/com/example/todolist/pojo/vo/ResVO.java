package com.example.todolist.pojo.vo;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ResVO<T> {
    /*
    1001 查询成功 1002 查询失败 1003 查询警告
    2001 添加成功 2002 添加失败 2003 添加警告
    3001 删除成功 3002 删除失败 3003 删除警告
    4001 修改成功 4002 修改失败 4003 修改警告
    5001 登录成功 5002 未登录   5003 登录异常
     */
    private int code;

    private String message;

    private T data;

}
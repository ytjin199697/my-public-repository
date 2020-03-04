package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("user_info")
public class ModelTemplate {

    @TableId("userId")
    private String userId;

    @TableField("username")
    private String username;

    @TableField("age")
    private int age;

}

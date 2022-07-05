package com.example.demo.springbootlession.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author ygt
 * @create 2022-07-01-17:26
 */
@ApiModel(value = "user",description = "用户对象user，系统管理员是Admin，密码123456")
public class User {
    @ApiModelProperty(value = "用户id",name = "id",example = "1")
    int id;
    @ApiModelProperty(value = "用户名称",name = "username",example = "伟大的土豆")
    String username;
    @ApiModelProperty(value = "用户密码",name = "password",example = "123456")
    String password;
}

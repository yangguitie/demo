package com.example.demo.springbootlession.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.ibatis.annotations.ConstructorArgs;

/**
 * @author ygt
 * @create 2022-05-30-14:32
 */
@TableName("newsuser") //默认的表明是news_user 所以这里需要自己规定的表明
@Data

public class NewsUser {
//    @TableId(type = IdType.AUTO) //自增长id
    private int id;
    private String name;
    private String password;

    public NewsUser() {
    }

    public NewsUser(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

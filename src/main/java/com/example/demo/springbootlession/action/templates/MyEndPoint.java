package com.example.demo.springbootlession.action.templates;

import com.example.demo.springbootlession.entity.Programmer;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author ygt
 * @create 2022-07-01-16:54
 */
//需要加@Component注解
@Component
@Endpoint(id = "programmer") //端点名称
public class MyEndPoint {
    @ReadOperation //从端点读取信息
    public Programmer read() {
        return new Programmer("孙悟空", 10000, 100000, new Date());
    }
}

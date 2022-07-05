package com.example.demo.springbootlession.action;

import com.example.demo.springbootlession.service.IdTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ygt
 * @create 2022-05-31-9:20
 */
@RestController
@RequestMapping("/testId")
public class TestId {
    @Autowired
    private IdTestService service;

    @RequestMapping("/add")
    public void add() {
        service.add();
    }
}

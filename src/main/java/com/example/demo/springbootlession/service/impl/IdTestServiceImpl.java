package com.example.demo.springbootlession.service.impl;

import com.example.demo.springbootlession.dao.CommonMapper;
import com.example.demo.springbootlession.entity.IdTest;
import com.example.demo.springbootlession.service.IdTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author ygt
 * @create 2022-05-31-9:16
 */
@Service
public class IdTestServiceImpl implements IdTestService {
    @Autowired
    private CommonMapper mapper;
    @Override
    public void add() {
        IdTest idTest = new IdTest();
        idTest.setName("idTest");
        idTest.setDate(new Date());
        mapper.insert(idTest);
        System.out.println(idTest.getId());

    }
}

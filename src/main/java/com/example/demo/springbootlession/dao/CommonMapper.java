package com.example.demo.springbootlession.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.springbootlession.entity.IdTest;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ygt
 * @create 2022-05-31-9:18
 */
@Mapper
public interface CommonMapper extends BaseMapper<IdTest> {
}

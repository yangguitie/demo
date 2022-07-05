package com.example.demo.springbootlession.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.springbootlession.entity.NewsUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
 
/**
 * @author ygt
 * @create 2022-05-30-15:48
 */
@Mapper
public interface NewsUserMapper extends BaseMapper<NewsUser> {
    List<NewsUser> xmlSelect();

    Page<NewsUser> xmlPage(Page<NewsUser> page);

    Page<NewsUser> xmlPage2(Page<NewsUser> page, @Param("id") Integer id);

    Page<NewsUser> xmlPage3(Page<NewsUser> page, @Param("user") NewsUser user);
}

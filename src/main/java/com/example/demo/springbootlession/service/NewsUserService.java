package com.example.demo.springbootlession.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.springbootlession.entity.NewsUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ygt
 * @create 2022-05-30-15:51
 */
public interface NewsUserService {
    int add(NewsUser user);
    List<NewsUser> selectUser();
    public String modifyUser1();
    public String removeUser();
    public String removeUser1();
    public NewsUser queryUser();
    public List<NewsUser> queryUsers();
    public Page<NewsUser> page();
    public List<NewsUser> queryUser2();
    public List<NewsUser> queryUser3();
    Page<NewsUser> xmlPage();
    Page<NewsUser> xmlPage2();
    Page<NewsUser> xmlPage3();
}

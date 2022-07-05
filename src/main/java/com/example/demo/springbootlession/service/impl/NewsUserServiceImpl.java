package com.example.demo.springbootlession.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.Query;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.springbootlession.dao.NewsUserMapper;
import com.example.demo.springbootlession.entity.NewsUser;
import com.example.demo.springbootlession.service.NewsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ygt
 * @create 2022-05-30-15:53
 */
@Service
public class NewsUserServiceImpl implements NewsUserService {
    @Autowired
    private NewsUserMapper dao;
    @Override
    public int add(NewsUser user) {
        return dao.insert(user);
    }

    @Override
    public List<NewsUser> selectUser() {
        return  dao.selectList(null);
    }
    public String modifyUser1(){
        NewsUser user = new NewsUser();
        user.setId(4);
        user.setName("xxxxx");
        QueryWrapper<NewsUser> wrapper = new QueryWrapper();
        wrapper.eq("id",4);
        int rows = dao.update(user, wrapper);
        return rows>0?"修改成功":"修改失败";
    }
    public String removeUser(){
        int rows = dao.deleteById(4);
        return rows>0?"删除成功":"删除失败";

    }
    public String removeUser1(){
        QueryWrapper<NewsUser> queryWrapper = new QueryWrapper();
        queryWrapper.gt("id",4);
        Integer rows = dao.delete(queryWrapper);
        return rows>0?"删除成功":"删除失败";

    }
    public NewsUser queryUser(){
        return dao.selectById(4);
    }
    public List<NewsUser> queryUsers(){
        return dao.selectList(null);
    }
    public Page<NewsUser> page(){
        Page<NewsUser> page = new Page<>(1, 2);
        return dao.selectPage(page,null);
    }
    public List<NewsUser> queryUser2(){
        QueryWrapper<NewsUser> wrapper = new QueryWrapper<>();
        wrapper.lambda().gt(id->{
            return "id";
        },2);
//        wrapper.gt("id",2);//id>2
        return dao.selectList(wrapper);
    }

    public List<NewsUser> queryUser3(){
        QueryWrapper<NewsUser> wrapper = new QueryWrapper<>();
        //id>1 and id<3
        wrapper.gt("id",1);
        wrapper.lt("id",3);
        wrapper.or().eq("id",1);
        return dao.selectList(wrapper);
    }

    public List<NewsUser> xmlQuery(){return dao.xmlSelect();}

    public  Page<NewsUser> xmlPage(){
        Page<NewsUser> page = new Page<>(1,2);
        return dao.xmlPage(page);
    }
    public  Page<NewsUser> xmlPage2(){
        Page<NewsUser> page = new Page<>(1,2);
        return dao.xmlPage2(page,2);
    }
    public  Page<NewsUser> xmlPage3(){
        Page<NewsUser> page = new Page<>(1,2);
        NewsUser user = new NewsUser();
        user.setId(2);
        return dao.xmlPage3(page,user);
    }
}

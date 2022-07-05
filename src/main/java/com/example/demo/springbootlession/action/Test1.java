package com.example.demo.springbootlession.action;

import com.alibaba.druid.support.logging.Log;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.auto.GreatPotatoesService;
import com.example.demo.springbootlession.entity.NewsUser;
import com.example.demo.springbootlession.service.NewsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ygt
 * @create 2022-05-30-14:35
 */
@RestController
public class Test1 {
   @Autowired
    private GreatPotatoesService service;
    @Autowired
    private NewsUserService service1;
   @GetMapping ("/test")
    public String test(){
       return service.say();
   }
   @RequestMapping("/insert")
    public int insert(){
       NewsUser newsUser = new NewsUser();
       newsUser.setName("王者荣耀");
       newsUser.setPassword("123456");
     return   service1.add(newsUser);
   }
   @RequestMapping("/select")
    public List<NewsUser> select(){
     return   service1.selectUser();
   }

   @RequestMapping("/update")
    public String update(){
       return service1.modifyUser1();
   }
   @RequestMapping("/delete")
    public String delete(){
       return service1.removeUser();
   }
    @RequestMapping("/delete1")
    public String delete1(){
        return service1.removeUser1();
    }
    @RequestMapping("/queryUser")
    public NewsUser queryUser(){
        return service1.queryUser();
    }
    @RequestMapping("/page")
    public Page<NewsUser> page(){
        return service1.page();
    }
}

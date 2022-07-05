package com.example.demo.springbootlession.action.templates;

import com.example.demo.springbootlession.entity.NewsUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ygt
 * @create 2022-07-01-15:01
 */
@RestController
@CrossOrigin(originPatterns = "*",allowCredentials="true",allowedHeaders = "*",methods = {})

public class ShoppingAction {
    private List<NewsUser> userList = new ArrayList<>();

    {
        userList.add(new NewsUser(1, "武大郎", "123456"));
        userList.add(new NewsUser(2, "西门庆", "123456"));
        userList.add(new NewsUser(3, "盘精炼", "123456"));
    }

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("user/user", "userList", userList);
    }

    @RequestMapping("/shopping")
    public ModelAndView index1() {
        return new ModelAndView("shopping", "userList", userList);
    }
}

package com.example.demo.springbootlession.action.templates;

import com.example.demo.springbootlession.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author ygt
 * @create 2022-07-01-17:30
 */
@RestController
//@CrossOrigin(allowCredentials = "true")//开启跨域
@CrossOrigin(originPatterns = "*",allowCredentials="true",allowedHeaders = "*",methods = {})
@Api(tags = "个人中心基本操作")
public class AdminController {
    @ApiOperation(value = "增加或者修改用户信息",
            notes = "如果用户id为0的时候表示新增用户，如果id大于0表示修改用户")
    @ApiImplicitParam(name = "user", value = "需要前端传递用户信息",
            paramType = "body", required = true, dataType = "user")
    @RequestMapping(value = "/api/addOrderUpdateUser", method = {RequestMethod.GET})
    public boolean addOrderUpdateUser(@RequestBody User user) {
        System.out.println(user);
        return true;
    }
}

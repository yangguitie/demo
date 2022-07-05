package com.example.demo;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication //标记这个类是一个springboot的应用
//@ServletComponentScan //扫描servlet容器
//@MapperScan("com.example.demo.springbootlession.dao")
public class DemoApplication {
//    拦截器 添加分页拦截
    @Bean
    public MybatisPlusInterceptor paginationInterceptor() {
        MybatisPlusInterceptor plus = new MybatisPlusInterceptor();
        plus.addInnerInterceptor(new PaginationInnerInterceptor());
        return plus;
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}

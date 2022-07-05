package com.example.demo.springbootlession.action.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ygt
 * @create 2022-07-01-17:18
 */
@Configuration
@EnableSwagger2 //开启swagger2，必须要加

public class SwaggerConfig   {
    @Bean
    public Docket docket() {
//        扫描包路径，加了Swagger注解的类包
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.springbootlession.action"))
                .paths(PathSelectors.any()).build();
    }

    //    构建api文档的详细信息函数
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("vue前端测试图书管理的接口说明")//页面标题
                .contact(new Contact("lyj", "", "123456@qq.com"))//创建人
                .version("1.0")//版本号
                .description("API 描述")//描述
                .build();
    }



}

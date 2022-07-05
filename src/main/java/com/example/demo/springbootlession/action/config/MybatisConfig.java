//package com.example.demo.springbootlession.action.templates;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//import javax.sql.DataSource;
//import java.io.IOException;
//
///**
// * @author ygt
// * @create 2022-07-01-16:13
// */
//@Configuration
//@MapperScan(basePackages = "com.example.demo.springbootlession.dao")//扫描dao层接口
//public class MybatisConfig {
//    @Value("${spring.datasource.driver-class-name}")
//    private String driverClassName;
//    @Value("${spring.datasource.url}")
//    private String url;
//    @Value("${spring.datasource.username}")
//    private String username;
//    @Value("${spring.datasource.password")
//    private String password;
//    @Bean
//    public DruidDataSource dataSource()  {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(this.driverClassName);
//        dataSource.setUrl(this.url);
//        dataSource.setUsername(this.username);
//        dataSource.setPassword(this.password);
//        dataSource.setInitialSize(5);//初始连接
//        dataSource.setMaxActive(10);//最大活动连接
//        dataSource.setMinIdle(1);//最小空闲数
//        dataSource.setMaxWait(60000);//最大等待时间-超时
//        return dataSource;
//    }
//
//    @Bean
//    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource)throws IOException{
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
////        bean.setConfigLocation();设置核心配置文件
//        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(
//                "classpath*:mapper/**/*Mapper.xml"));
//        return bean;
//    }
//}

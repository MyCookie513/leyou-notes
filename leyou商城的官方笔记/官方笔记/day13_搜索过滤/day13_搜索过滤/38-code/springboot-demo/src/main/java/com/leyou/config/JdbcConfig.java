//package com.leyou.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//import javax.sql.DataSource;
//
///**
// * @Author: taft
// * @Date: 2018-8-7 15:44
// */
//@Configuration
////@PropertySource("classpath:application.yml")
//
//public class JdbcConfig {
////    @Value("${jdbc.url}")
////    String url;
////    @Value("${jdbc.driverClassName}")
////    String driverClassName;
////    @Value("${jdbc.username}")
////    String username;
////    @Value("${jdbc.password}")
////    String password;
//
//    //@Autowired
//    //private JdbcProperties jdbc;
//
//
//    //当前方法返回的对象将被spring管理
//    @Bean
//    @ConfigurationProperties(prefix = "jdbc")
//    public DataSource getDataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        return dataSource;
//    }
//
//}

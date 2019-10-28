//package com.leyou.config;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//
////使用这种方式发现资源，必须资源名称命名为application.properties 或者application.yml
////必须指定读取哪一部分资源，java类中定义的属性名称，必须和属性文件中的名称一致
////因为，springboot属性注入从资源开始，会根据资源的名称给java属性赋值（调用set方法）
//@ConfigurationProperties(prefix = "jdbc")
//public class JdbcProperties {
//    private String url;
//    private String driverClassName;
//    private String username;
//    private String password;
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getDriverClassName() {
//        return driverClassName;
//    }
//
//    public void setDriverClassName(String driverClassName) {
//        this.driverClassName = driverClassName;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}
package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: taft
 * @Date: 2018-8-7 15:14
 */
//声明这是一个springboot的工程
@SpringBootApplication
@MapperScan("com.leyou.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}

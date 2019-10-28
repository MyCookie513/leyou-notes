package com.leyou.controller;

import com.leyou.pojo.User;
import com.leyou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: taft
 * @Date: 2018-8-7 15:22
 */
@RestController
@RequestMapping("user")
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User sayHello(@PathVariable("id") Long id){
        return userService.queryById(id);
    }

    @GetMapping()
    public ResponseEntity<List<User>> findAll(){


        List<User> userList = userService.findAll();

        return   ResponseEntity.ok(userList);
    }
}

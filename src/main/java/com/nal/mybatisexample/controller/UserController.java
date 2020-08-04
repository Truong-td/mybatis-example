package com.nal.mybatisexample.controller;

import com.nal.mybatisexample.dao.IUserDao;
import com.nal.mybatisexample.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class UserController {
    @Autowired
    private IUserDao userDao;

    @GetMapping("/1")
    public String index(){
        return "Hello";
    }

    @RequestMapping("/2")
    public List<User> getAll() {
        return userDao.getAll();
    }
}

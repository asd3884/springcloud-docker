package com.example.microserviceprovideruser.controller;


import com.example.microserviceprovideruser.pojo.User;
import com.example.microserviceprovideruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public User getUserbyId(@PathVariable Long id){

        return  userService.getUserById(id);
    }
}

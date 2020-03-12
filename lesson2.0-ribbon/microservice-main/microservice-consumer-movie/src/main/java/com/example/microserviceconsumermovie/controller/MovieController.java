package com.example.microserviceconsumermovie.controller;

import com.example.microserviceconsumermovie.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/user/{id}")
    public User getUserbyId(@PathVariable Long id){
        return restTemplate.getForObject("http://eureka-user/"+id,User.class);
    }


}

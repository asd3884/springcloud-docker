package com.example.microserviceprovideruser.service.impl;

import com.example.microserviceprovideruser.dao.UserDao;
import com.example.microserviceprovideruser.pojo.User;
import com.example.microserviceprovideruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Long id){
        return userDao.getUserById(id);
    }


    public Boolean getUser(String username,String password){
        return  userDao.getUser(username,password);
    }
}


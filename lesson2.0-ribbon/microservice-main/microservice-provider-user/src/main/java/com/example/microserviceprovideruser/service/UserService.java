package com.example.microserviceprovideruser.service;

import com.example.microserviceprovideruser.pojo.User;

public interface UserService {

    User getUserById(Long id);

    Boolean getUser(String username, String password);
}

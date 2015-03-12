package com.excavator.service;

import com.excavator.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> listUsers();
}
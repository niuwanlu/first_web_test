package com.excavator.dao;

import com.excavator.model.User;

import java.util.List;

public interface UserDAO {
    void addUser (User user);
    List<User> listUsers();
}
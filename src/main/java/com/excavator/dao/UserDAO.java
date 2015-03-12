package com.excavator.dao;

import com.excavator.model.User;

import java.util.List;

public interface UserDAO {
    public void addUser (User user);
    public List<User> listUsers();
}
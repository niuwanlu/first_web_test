package com.excavator.service;

import com.excavator.model.Users;

import java.util.List;

public interface UsersService {
    public void addUser(Users user);
    public List<Users> listUsers();
}
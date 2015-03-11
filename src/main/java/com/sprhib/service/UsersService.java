package com.sprhib.service;

import com.sprhib.model.Users;

import java.util.List;

public interface UsersService {
    public void addUser(Users user);
    public List<Users> listUsers();
}
package com.excavator.dao;

import com.excavator.model.Users;

import java.util.List;

public interface UsersDAO {
    public void addUser (Users user);
    public List<Users> listUsers();
}
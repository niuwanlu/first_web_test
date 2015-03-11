package com.sprhib.dao;

import com.sprhib.model.Users;

import java.util.List;

public interface UsersDAO {
    public void addUser (Users user);
    public List<Users> listUsers();
}
package com.excavator.service;

import com.excavator.dao.UsersDAO;
import com.excavator.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDAO usersDAO;
    public void setUsersDAO(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }

    @Override
    @Transactional
    public void addUser(Users user) {
        this.usersDAO.addUser(user);
    }

    @Override
    @Transactional
    public List<Users> listUsers(){
        return this.usersDAO.listUsers();
    }

}
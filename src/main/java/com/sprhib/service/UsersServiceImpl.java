package com.sprhib.service;

import com.sprhib.dao.UsersDAO;
import com.sprhib.model.Users;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
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
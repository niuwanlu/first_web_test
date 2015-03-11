package com.sprhib.dao;

import com.sprhib.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UsersDAOImpl implements UsersDAO {
    private static final Logger logger = LoggerFactory.getLogger(UsersDAOImpl.class);
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void addUser(Users user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(user);
        logger.info("User saved successfully, User Details=" + user);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Users> listUsers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Users> usersList = session.createQuery("from Users").list();
        for (Users user : usersList) {
            logger.info("Users List::"+user);
        }
        return usersList;
    }
}
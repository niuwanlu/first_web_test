package com.excavator.controller;

import com.excavator.model.User;
import com.excavator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class UsersController {

    @Autowired(required = true)
    private UserService userService;

    @Qualifier(value = "userService")
    public void setUserService(UserService us) {
        this.userService = us;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String listUsers(Model model) {
        ArrayList<User> userList = (ArrayList<User>)userService.listUsers();
        User tempUser = userList.get(0);
        model.addAttribute("id", tempUser.getId());
        model.addAttribute("username", tempUser.getUsername());
//        model.addAttribute("listUser", this.userService.listUsers());
        return "user";
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user) {
            this.userService.addUser(user);
        return "redirect:/user";
    }
}
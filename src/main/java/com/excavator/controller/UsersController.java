package com.excavator.controller;

import com.excavator.model.Users;
import com.excavator.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UsersController {

    private UsersService usersService;

    @Autowired(required = true)
    @Qualifier(value = "usersService")
    public void setUsersService(UsersService us) {
        this.usersService = us;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String listUsers(Model model) {
        model.addAttribute("user", new Users());
        model.addAttribute("listUsers", this.usersService.listUsers());
        return "user";
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") Users user) {
            this.usersService.addUser(user);
        return "redirect:/users";
    }
}
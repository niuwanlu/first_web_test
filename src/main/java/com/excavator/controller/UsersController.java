package com.excavator.controller;

import com.excavator.model.NewsLinkExisted;
import com.excavator.model.PageInfo;
import com.excavator.model.User;
import com.excavator.service.NewsLinkExistedService;
import com.excavator.service.UserService;
import com.excavator.utils.pagepaser.PageParser;
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
    @Autowired
    private User user;
    @Autowired
    private NewsLinkExisted newsLinkExisted;
    @Autowired
    private NewsLinkExistedService newsLinkExistedService;
    @Autowired
    private PageParser pageParser;

    @Qualifier(value = "userService")
    public void setUserService(UserService us) {
        this.userService = us;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String listUsers(Model model) {
        PageInfo pageInfo = pageParser.getPageInfo("http://news.sina.com.cn/c/2015-03-15/123431608770.shtml");
        newsLinkExisted.setTitle(pageInfo.getTitle());
        newsLinkExisted.setAbstract_text(pageInfo.getAbstract_text());
        System.out.println(pageInfo.getTitle());
        newsLinkExistedService.addUser(newsLinkExisted);
        ArrayList<User> userList = (ArrayList<User>)userService.listUsers();
        System.out.println("num: " + userList.size());
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
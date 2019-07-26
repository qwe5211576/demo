package com.zb.demo.controller;

import com.zb.demo.entity.User;
import com.zb.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {
    @Autowired
    UserService us;

    @Value("${server.port}")
    String port;

    @RequestMapping("/list")
    public String findAll(User user, Model model){
        model.addAttribute("user",us.findAll(user));
        return "/list";
    }

}

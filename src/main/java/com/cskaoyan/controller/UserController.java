package com.cskaoyan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


    @RequestMapping("")
    public String init() {

        return "login";
    }

    @RequestMapping("home")
    public String login() {

        return "home";
    }
}

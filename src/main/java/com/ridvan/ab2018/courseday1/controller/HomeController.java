package com.ridvan.ab2018.courseday1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    HomeController homeController;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello() {
        return "index" ;
    }
}

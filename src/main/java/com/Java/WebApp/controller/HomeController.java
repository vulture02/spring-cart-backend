package com.Java.WebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "hello Amith";
    }
    @RequestMapping("/about")
    public String about(){
        return "hi welcome to shop";
    }

}

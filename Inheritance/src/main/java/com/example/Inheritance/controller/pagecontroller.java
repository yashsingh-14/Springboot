package com.example.Inheritance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pagecontroller {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/contect")
    public String contect(){
        return "contect";
    }
}

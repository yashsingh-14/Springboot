package com.example.first_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ControllerHello {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
    
}

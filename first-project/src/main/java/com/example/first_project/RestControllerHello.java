package com.example.first_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerHello {
    @GetMapping("/resthello")
    public String restHello(){
        return "Hello world using rest controller";
    }
    @GetMapping("/resthello1")
    public String resthello1(){
        return "Hello world using rest controller 111";
    }
}

package com.example.first_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ControllerHello {

    @GetMapping("/")
    public String index(Model model){
        


        List<String> Fruits = new ArrayList<>();
        
        Fruits.add("Mango");
        Fruits.add("Banana");
        Fruits.add("Orange");
        Fruits.add("Apple");
        Fruits.add("Graps");

        model.addAttribute("Fruits", Fruits);

        return"index";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
    
}

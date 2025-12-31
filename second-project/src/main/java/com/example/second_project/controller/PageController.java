package com.example.second_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PageController {
      @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name","Tony Stark");
        model.addAttribute("heroic_name","Ironman");

        //if condition

        model.addAttribute("ishero", false);
        return "index";
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

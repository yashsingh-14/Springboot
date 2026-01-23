package com.example.second_project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class PageController {
      @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name","Tony Stark");
        model.addAttribute("heroic_name","Ironman");

        //if condition

        model.addAttribute("ishero", false);
        //loop

       List<String>vegitables = new ArrayList<>();
       vegitables.add("Tomatos");
       vegitables.add("potatos");
       vegitables.add("garlic");
       vegitables.add("onion");

       model.addAttribute("veg", vegitables);

     List<String>avengers = new ArrayList<>();
      avengers.add("Captain America");
      avengers.add("Hulk");
      avengers.add("Spider man");
      avengers.add("Thor");
      avengers.add("Iron man");

      model.addAttribute("aven", avengers);

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

    @GetMapping("/product/{id}")
    public String product(@PathVariable int id,Model model ){

      System.out.println("fetch id"+id);
      model.addAttribute("product_id", 34);
      return "product";
    }

}

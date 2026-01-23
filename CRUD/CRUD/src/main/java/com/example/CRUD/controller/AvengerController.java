package com.example.CRUD.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.CRUD.model.Avenger;
import com.example.CRUD.repository.AvengerRepository;

@Controller
public class AvengerController {

    private final AvengerRepository repo;

    public AvengerController(AvengerRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("avengers", repo.findAll());
        model.addAttribute("avenger", new Avenger());
        return "index";
    }

    @PostMapping("/addAvenger")
    public String addAvenger(Avenger avenger) {
        repo.save(avenger);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteAvenger(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        model.addAttribute("avenger", repo.findById(id).orElse(null));
        return "update";
    }
}

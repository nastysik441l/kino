package com.example.kino.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainscreenController {

    @GetMapping("/")
    public String mainscreen(Model model) {
        model.addAttribute("title", "Главная страница");
        return "mainscreen";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Концерты");
        return "about";
    }

    @GetMapping("/theaters")
    public String theaters(Model model) {
        model.addAttribute("title", "Театры");
        return "theaters";
    }


}



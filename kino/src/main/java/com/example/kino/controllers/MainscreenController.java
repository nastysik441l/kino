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
    @GetMapping("/film2")
    public String film2s(Model model) {
        model.addAttribute("title", " Кино");
        return "film2";
    }
    @GetMapping("/history")
    public String historys(Model model) {
        model.addAttribute("title", " История заказов");
        return "history";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Концерты");
        return "about";
    }

    @GetMapping("//theaters/add")
    public String theaters(Model model) {
        model.addAttribute("title", "Театры");
        return "/theaters/add";
    }

    @GetMapping("/film")
    public String films(Model model) {
        model.addAttribute("title", "Кино");
        return "film";
    }



}



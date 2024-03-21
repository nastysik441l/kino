package com.example.kino.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
@Controller

public class MainController {
    @GetMapping("/menu")
    public String menuMain(Model model){
return "menu-main";
    }
}

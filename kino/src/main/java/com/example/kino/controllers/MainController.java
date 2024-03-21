package com.example.kino.controllers;

import com.example.kino.models.Post;
import com.example.kino.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/menu")
    public String menuMain(Model model){
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "menu-main";
    }

    @GetMapping("/theaters/add")
    public String theatersAdd(Model model){
        return "theaters-add";
    }
}


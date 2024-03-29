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
    @GetMapping("/cinema")
    public String cinemas(Model model) {
        model.addAttribute("title", "Кинотеатры");
        return "cinema";
    }
    @GetMapping("/konsol")
    public String konsols(Model model) {
        model.addAttribute("title", "Консультация");
        return "konsol";
    }
    @GetMapping("/texnik")
    public String texniks(Model model) {
        model.addAttribute("title", "Акции и скидки");
        return "texnik";
    }  @GetMapping("/delete")
    public String delete(Model model) {
        model.addAttribute("title", "Удаление аккаунта");
        return "delete";
    }
    @GetMapping("/action")
    public String actions(Model model) {
        model.addAttribute("title", "Технические сложности");
        return "action";
    }
    @GetMapping("/registration")
    public String registrations(Model model) {
        model.addAttribute("title", "вход в личный кабинет");
        return "registration";
    }
    @GetMapping("/sekino")
    public String sekinos(Model model) {
        model.addAttribute("title", "Сейчас в кино");
        return "sekino";
    }
    @GetMapping("/vozrat")
    public String vozrats(Model model) {
        model.addAttribute("title", "Возрат билетов");
        return "vozrat";
    }

    @GetMapping("/action2")
    public String actionfs(Model model) {
        model.addAttribute("title", "Акции и скидки");
        return "action2";
    }
    @GetMapping("/theaters/add")
    public String theatersAdd(Model model){
        return "theaters-add";
    }
    @GetMapping("/enterfilm")
    public String enterfilms(Model model) {
        model.addAttribute("title", "выбор мест-кино");
        return "enterfilm";
    }
    @GetMapping("/sechazkino")
    public String sechazkinos(Model model) {
        model.addAttribute("title", " Скoро в прокате-кино");
        return "sechazkino";
    }
    @GetMapping("/popkorn")
    public String popkorns(Model model) {
        model.addAttribute("title", " попкорн билеты - кино");
        return "popkorn";
    }
    @GetMapping("/oplata")
    public String oplatas(Model model) {
        model.addAttribute("title", " оплата -кино");
        return "oplata";
    }
    @GetMapping("/afishakon")
    public String afishakons(Model model) {
        model.addAttribute("title", " оплата -кино");
        return "afishakon";
    }
}


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
    } @GetMapping("/registr1")
    public String registr1s(Model model) {
        model.addAttribute("title", "вход в личный кабинет 1");
        return "registr1";
    }
    @GetMapping("/login")
    public String logis(Model model) {
        model.addAttribute("title", "вход в личный кабинет 1");
        return "login";
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
    }  @GetMapping("/abouttwo")
    public String abouttwos(Model model) {
        model.addAttribute("title", "Главная - концерты 2");
        return "abouttwo";
    }

    @GetMapping("/action")
    public String actions(Model model) {
        model.addAttribute("title", "Акции и скидки ");
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
   
    @GetMapping("/enterfilm")
    public String enterfilms(Model model) {
        model.addAttribute("title", "выбор мест-кино");
        return "enterfilm";
    }@GetMapping("/film1")
    public String film1s(Model model) {
        model.addAttribute("title", "переход в кино - кино");
        return "film1";
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
        model.addAttribute("title", " оплата концерт");
        return "afishakon";
    }
    @GetMapping("/mestastol")
    public String mestastols(Model model) {
        model.addAttribute("title", " места стол- концерт");
        return "mestastol";
    }

    @GetMapping("/mestastol2")
    public String mestastol2s(Model model) {
        model.addAttribute("title", "количество мест- концерт");
        return "mestastol2";
    }  @GetMapping("/pricekonchert")
    public String pricekoncherts(Model model) {
        model.addAttribute("title", "оплата концерт");
        return "pricekonchert";
    }

    @GetMapping("/galerrykon")
    public String gallerykons(Model model) {
        model.addAttribute("title", "Галерея- концерты");
        return "galerrykon";
    }@GetMapping("/galerryteather")
    public String gallerryteathers(Model model) {
        model.addAttribute("title", "Галерея- концерт2");
        return "galerryteather";
    }
    @GetMapping("/kolmest")
    public String kolmests(Model model) {
        model.addAttribute("title", "размещение стол- концерт");
        return "kolmest";
    }
    @GetMapping("/oplatakon")
    public String oplatakons(Model model) {
        model.addAttribute("title", "места стол- концерт");
        return "oplatakon";
    }
    @GetMapping("/fan")
    public String fans(Model model) {
        model.addAttribute("title", "фанклуб- концерт");
        return "fan";
    }
    @GetMapping("/teather2")
    public String teather2s(Model model) {
        model.addAttribute("title", "  Театр2");
        return "teather2";
    }
    @GetMapping("/afishateather")
    public String afishatheaters(Model model) {
        model.addAttribute("title", "Афиша - Театр");
        return "afishateather";
    }
    @GetMapping("/mestoteat")
    public String mestoteats(Model model) {
        model.addAttribute("title", "выбор мест - Театр");
        return "mestoteat";
    }


    @GetMapping("/priceteat")
    public String priceteats(Model model) {
        model.addAttribute("title", "оплата - Театр");
        return "priceteat";
    }

    @GetMapping("/kolrukte")
    public String kolruktes(Model model) {
        model.addAttribute("title", " Колектив руководство театр");
        return "kolrukte";
    }

    @GetMapping("/oteat")
    public String oteats(Model model) {
        model.addAttribute("title", "  О театр");
        return "oteat";
    }
    @GetMapping("/news")
    public String newss(Model model) {
        model.addAttribute("title", " новости- театр ");
        return "news";
    }
    @GetMapping("/kolruktesoper")
    public String kolruktesoper(Model model) {
        model.addAttribute("title", " Колектив оперная труппа театр");
        return "kolruktesoper";
    }@GetMapping("/kolruktesbal")
    public String kolruktesbal(Model model) {
        model.addAttribute("title", " Колектив балетная труппа театр");
        return "kolruktesbal";
    }@GetMapping("/kolruktesork")
    public String kolruktesorks(Model model) {
        model.addAttribute("title", " Колектив оркестр театр");
        return "kolruktesork";
    }
    @GetMapping("/galerbalet")
    public String galerbalets(Model model) {
        model.addAttribute("title", " Галерея- театр");
        return "galerbalet";
    }@GetMapping("/galerbalet1")
    public String galerbalet1s(Model model) {
        model.addAttribute("title", "Галерея- театр 2");
        return "galerbalet1";
    }
}


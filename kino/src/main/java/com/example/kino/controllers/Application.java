package com.example.kino.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
@RestController
class UserController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostMapping("/registration")
    public Long registerUser(@RequestBody Map<String, String> userData) {
        String phone = userData.get("phone");

        // Вставляем данные нового пользователя в таблицу users
        String sql = "INSERT INTO users (phone) VALUES (?)";
        jdbcTemplate.update(sql, phone);

        // Получаем id только что зарегистрированного пользователя
        Long userId = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Long.class);

        return userId;
    }
}


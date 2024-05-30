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

    @RestController
    class UserController {
        @Autowired
        private JdbcTemplate jdbcTemplate;

        @PostMapping("/registration")
        public Long registerUser(@RequestBody Map<String, String> userData) {
            String login = userData.get("login");
            String password = userData.get("password");

            // Вставляем данные нового пользователя в таблицу users
            String sql = "INSERT INTO users (login, password) VALUES (?, ?)";
            jdbcTemplate.update(sql, login, password);

            // Получаем id только что зарегистрированного пользователя
            Long userId = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Long.class);

            return userId;
        }

        @PostMapping("/registr1")
        public Long registerUser2(@RequestBody Map<String, String> userData) {
            String fullName = userData.get("full_name");
            String email = userData.get("email");
            String password = userData.get("password");

            // Вставляем данные нового пользователя в таблицу register
            String sql = "INSERT INTO register (full_name, email, password) VALUES (?, ?, ?)";
            jdbcTemplate.update(sql, fullName, email, password);

            // Получаем id только что зарегистрированного пользователя
            Long userId = jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", Long.class);

            return userId;
        }
    }

    @RestController
    @RequestMapping("/seats")
    class SeatController {
        @Autowired
        private JdbcTemplate jdbcTemplate;

        @PostMapping("/select")
        public String selectSeat(@RequestBody Map<String, Integer> seatData) {
            int x = seatData.get("x");
            int y = seatData.get("y");
            int width = seatData.get("width");
            int height = seatData.get("height");

            // Вставляем данные о выбранном месте в таблицу selected_seats
            String sql = "INSERT INTO selected_seats (x, y, width, height) VALUES (?, ?, ?, ?)";
            jdbcTemplate.update(sql, x, y, width, height);

            return "Seat selected successfully";
        }
    }
}

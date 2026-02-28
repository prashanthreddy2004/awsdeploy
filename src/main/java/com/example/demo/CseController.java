package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {

    @GetMapping("/home")
    public String welcomeCse() {
        return "Welcome to Jenkins AWS from Aditya";
    }

    @GetMapping("/adity")
    public String welcomeIt() {
        return "Welcome to CSE";
    }
}
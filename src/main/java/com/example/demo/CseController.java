package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {

    @GetMapping("/home")
    public String home() {
        return "Task Completed By 23MH1A05J9";
    }

    @GetMapping("/cse")
    public String welcome() {
        return "Welcome to Aditya";
    }
}
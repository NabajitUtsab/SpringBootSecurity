package com.example.Security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {
    @GetMapping
    public String practice() {
        return "Hello World";
    }

    @GetMapping("/public")
    public String publicPractice() {
        return "This is for all users";
    }

    @GetMapping("/private/{name}")
    public String privatePractice(@PathVariable String name) {
        return "This is only for "+name;
    }
}

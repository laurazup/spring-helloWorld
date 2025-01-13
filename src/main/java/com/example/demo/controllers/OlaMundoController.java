package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoController {
    @GetMapping("/")
    public String healthCheck() {
        return "Ola Mundo!";
    }
}

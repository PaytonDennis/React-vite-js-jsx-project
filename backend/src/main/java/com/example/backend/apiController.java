package com.example.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/api/oop-message")
    public String getOopMessage() {
        return "Hello, OOP Practice!";
    }
}

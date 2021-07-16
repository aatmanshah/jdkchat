package com.aatman.springbootapp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(@RequestParam(required = false) String id) {
        id = id == null ? "aatman" : id;
        return "Welcome to Spring boot, " + id;
    }
}

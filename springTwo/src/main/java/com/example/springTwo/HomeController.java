package com.example.springTwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Map root URL to login page
    @GetMapping("/")
    public String home() {
        return "redirect:/login";
    }

    // Explicit login page mapping
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }
}
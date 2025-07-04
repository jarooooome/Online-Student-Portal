package com.example.springTwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/login")
    public String showLoginPage() {
        // Make sure this matches your actual template filename
        // Without the .html extension
        return "login";
    }
}
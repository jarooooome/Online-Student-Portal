package com.example.springTwo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.security.core.Authentication;

@Controller
public class AdminController {

    @GetMapping("/admin/dashboard")
    public String adminDashboard(Authentication authentication, Model model) {
        String username = authentication.getName();
        model.addAttribute("username", username);
        return "admin/dashboard"; // will render templates/admin/dashboard.html
    }
}

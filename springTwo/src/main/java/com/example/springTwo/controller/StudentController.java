package com.example.springTwo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/student/dashboard")
    public String studentDashboard(Authentication authentication, Model model) {
        String username = authentication.getName();
        model.addAttribute("username", username);
        return "student/dashboard"; // This maps to templates/student/dashboard.html
    }
}

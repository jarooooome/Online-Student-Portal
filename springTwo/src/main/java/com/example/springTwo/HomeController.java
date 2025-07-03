package com.example.springTwo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // Changed from @RestController to serve HTML views
public class HomeController {

    // Serve the login page
    @GetMapping("/")
    public String home() {
        return "redirect:/login";
    }

    // Serve the login page
    @GetMapping("/login")
    public String showLoginPage() {
        return "index";  // This will return the index.html from static folder
    }

    // Handle login form submission
    @PostMapping("/login")
    public String handleLogin(
            @RequestParam String username,
            @RequestParam String password) {
        // Add your authentication logic here
        // For now, we'll just redirect to dashboard

        return "redirect:/dashboard";
    }

    // Dashboard page after successful login
    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard";  // You'll need to create this template
    }

    // Logout handler
    @GetMapping("/logout")
    public String handleLogout() {
        // Add logout logic here
        return "redirect:/login?logout";
    }

    // Example of other student portal pages
    @GetMapping("/grades")
    public String showGrades() {
        return "grades";  // You'll need to create this template
    }

    @GetMapping("/schedule")
    public String showSchedule() {
        return "schedule";  // You'll need to create this template
    }
}

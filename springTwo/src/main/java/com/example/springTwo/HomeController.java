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

    
}

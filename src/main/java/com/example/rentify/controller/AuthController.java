package com.example.rentify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.rentify.model.User;
import com.example.rentify.service.UserService;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginPage() {
        return "auth/login2";
    }

    @GetMapping("/register")
    public String showRegisterPage(Model model) {
        model.addAttribute("user", new User());
        return "auth/register2";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        user.setRole("ROLE_BUYER");
        userService.registerUser(user);
        return "redirect:/login";
    }
    @GetMapping("/register-seller")
    public String showSellerRegisterPage(Model model) {
        model.addAttribute("user", new User());
        return "auth/register3";
    }

    @PostMapping("/register-seller")
    public String registerSeller(@ModelAttribute User user, Model model) {
        user.setRole("ROLE_SELLER");
        userService.registerUser(user);
        return "redirect:/login";
    }
}

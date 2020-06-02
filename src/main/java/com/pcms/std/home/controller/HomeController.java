package com.pcms.std.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/login.do")
    public String home(Model model) {
        return "common/login";
    }

    @GetMapping("/register.do")
    public String register(Model model) {
        return "common/register";
    }
}

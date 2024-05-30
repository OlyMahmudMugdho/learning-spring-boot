package com.mahmud.jwtpracticetwo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String serveLoginPage(){
        return "login.html";
    }
}

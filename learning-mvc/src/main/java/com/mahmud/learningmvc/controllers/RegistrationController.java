package com.mahmud.learningmvc.controllers;

import com.mahmud.learningmvc.models.RegistrationForm;
import com.mahmud.learningmvc.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/register")
public class RegistrationController {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public RegistrationController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("")
    public String showRegistrationForm(Model model, @ModelAttribute("registrationForm") RegistrationForm registrationForm) {
        return "register-form";
    }

    @PostMapping("")
    public String register(@ModelAttribute("registrationForm") RegistrationForm registrationForm) {
        System.out.println(registrationForm);
        userRepository.save(registrationForm.toUser(passwordEncoder));
        return "redirect:/login";
    }

}

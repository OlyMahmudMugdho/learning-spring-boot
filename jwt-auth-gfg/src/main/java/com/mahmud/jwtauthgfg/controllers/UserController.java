package com.mahmud.jwtauthgfg.controllers;

import com.mahmud.jwtauthgfg.models.entities.UserEntity;
import com.mahmud.jwtauthgfg.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public String home() {
        return "user page";
    }

    @PostMapping("")
    public UserEntity addUser(@RequestBody UserEntity user) {

        return userService.createUser(user);
    }
}

package com.mahmud.learningmvc.controllers;

import com.mahmud.learningmvc.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    
    private final List<User> users = new ArrayList<>();

    @GetMapping("")
    public String usersPage(Model model) {

        if(users.isEmpty()) {
            users.add(new User(1,"mila","Meftahul Jannat Mila","mila@gmail.com"));
            users.add(new User(2,"mugdho","M. Oly Mahmud","mugdho@gmail.com"));
        }

        model.addAttribute("userList",users);
        return "user";
    }

    @GetMapping("/add")
    public String addUserPage(Model model) {
        model.addAttribute("user", new User());
        return "userForm";
    }

    @PostMapping("/add-user")
    public String addUser(@ModelAttribute("user") User user) {
        System.out.println(user);
        users.add(user);
        return "redirect:/users";
    }


}

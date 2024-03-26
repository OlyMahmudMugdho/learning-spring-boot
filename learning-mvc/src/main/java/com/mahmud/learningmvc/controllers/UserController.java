package com.mahmud.learningmvc.controllers;

import com.mahmud.learningmvc.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    private List<UserDetails> users = new ArrayList<>();

//    @GetMapping("")
//    public String usersPage(Model model,  UserDetails user) {
//
//        List<User> users = new ArrayList<>();
//
//        System.out.println(user.getName());
//
//        if(users.isEmpty()) {
//            users.add(new User(1,"mila","Meftahul Jannat Mila","mila@gmail.com",passwordEncoder.encode("mila")));
//            users.add(new User(2,"mugdho","M. Oly Mahmud","mugdho@gmail.com",passwordEncoder.encode("mugdho")));
//        }
//
//        model.addAttribute("userList",users);
//        return "user";
//    }

    @GetMapping("")
    public String home(Principal principal) {
        System.out.println(principal.getName());
        return "home";
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

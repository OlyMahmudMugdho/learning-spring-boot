package com.mahmud.learningmvc.controllers;

import com.mahmud.learningmvc.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping("")
    public String home() {
        return "home";
    }

//    @GetMapping("/user")
//    public String user(Model model) {
//
//        ArrayList<User> userList = new ArrayList<>();
//
//        User mila = new User(1,"mila","Meftahul Jannat Mila","mila@gmail.com");
//        User mugdho = new User(2,"mugdho","M. Oly Mahmud","mugdho@gmail.com");
//        User meghla = new User(3,"meghla","Maliha Ferdous Meghla","meghla@gmail.com");
//
//        userList.add(mila);
//        userList.add(mugdho);
//        userList.add(meghla);
//
//        model.addAttribute("userList",userList);
//        return "user";
//    }
}

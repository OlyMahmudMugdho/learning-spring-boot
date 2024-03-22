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

    @GetMapping("/user")
    public String user(Model model) {

        ArrayList<User> userList = new ArrayList<>();

        User mugdho = new User(10,"mugdho","M. Oly Mahmud","mugdho@gmail.com");
        User mila = new User(11,"mila","Maliha Ferdous Meghla","meghla@gmail.com");
        User meghla = new User(12,"meghla","Meftahul Jannat Mila","meghla@gmail.com");

        userList.add(mugdho);
        userList.add(mila);
        userList.add(meghla);

        model.addAttribute("userList",userList);
        return "user";
    }
}

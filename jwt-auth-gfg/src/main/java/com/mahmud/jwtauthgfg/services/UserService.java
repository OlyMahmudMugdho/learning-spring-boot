package com.mahmud.jwtauthgfg.services;

import com.mahmud.jwtauthgfg.models.entities.UserEntity;
import com.mahmud.jwtauthgfg.repositories.UserRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity createUser(UserEntity user) {
        List<UserDetails> users = new ArrayList<>();
        users.add(new User(user.getUsername(),user.getPassword(), Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));
        return userRepository.save(user);
    }
}

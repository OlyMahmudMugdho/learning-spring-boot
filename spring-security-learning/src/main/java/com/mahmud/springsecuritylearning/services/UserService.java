package com.mahmud.springsecuritylearning.services;

import com.mahmud.springsecuritylearning.models.Role;
import com.mahmud.springsecuritylearning.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    UserService(PasswordEncoder passwordEncoder){
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (!username.equals("mugdho")) {
            throw new UsernameNotFoundException("mugdho");
        }

        Role role = new Role("USER");

        Set<Role> roles = new HashSet<>();
        roles.add(role);

        return new UserModel(1,"mugdho", passwordEncoder.encode("12345678"), roles );
    }
}

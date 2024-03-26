package com.mahmud.learningmvc.models;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data

public class RegistrationForm {
    private String username;
    private String name;
    private String password;
    private String email;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(username,name,email,passwordEncoder.encode(password));
    }
}

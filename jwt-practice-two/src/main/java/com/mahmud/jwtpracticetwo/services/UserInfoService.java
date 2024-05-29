package com.mahmud.jwtpracticetwo.services;

import com.mahmud.jwtpracticetwo.models.User;
import com.mahmud.jwtpracticetwo.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserInfoService implements UserDetailsService {

    private UserRepository userRepository;

    public UserInfoService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);
        if (user.isPresent()){
            return new UserInfoDetails(user.get());
        }
        throw new UsernameNotFoundException("User not found");
    }
}

package com.mahmud.jwtpracticetwo.services;

import com.mahmud.jwtpracticetwo.models.User;
import com.mahmud.jwtpracticetwo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserInfoService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);
        if (user.isPresent()){
            return new UserInfoDetails(user.get());
        }
        throw new UsernameNotFoundException("User not found");
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

}

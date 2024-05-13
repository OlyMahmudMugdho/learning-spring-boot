package com.mahmud.oauth2custom.configs;

import com.mahmud.oauth2custom.models.User;
import com.mahmud.oauth2custom.repository.RoleRepository;
import com.mahmud.oauth2custom.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public UserDetailsService userDetailsManager(UserRepository userRepository, RoleRepository roleRepository){
        return username -> {
            User user = userRepository.findByUsername(username);
            if (user != null) {
                return user;
            }
            throw new UsernameNotFoundException("User not found");
        };
    }

}

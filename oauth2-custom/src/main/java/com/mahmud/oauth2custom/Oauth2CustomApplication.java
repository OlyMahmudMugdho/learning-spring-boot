package com.mahmud.oauth2custom;

import com.mahmud.oauth2custom.models.Role;
import com.mahmud.oauth2custom.models.User;
import com.mahmud.oauth2custom.repository.RoleRepository;
import com.mahmud.oauth2custom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Oauth2CustomApplication {

	private final RoleRepository roleRepository;
	private final UserRepository userRepository;
	private PasswordEncoder passwordEncoder;

	@Bean PasswordEncoder createPasswordEncoder(){
		passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder;
	}

	@Autowired
    public Oauth2CustomApplication(RoleRepository roleRepository, UserRepository userRepository) {
        this.roleRepository = roleRepository;
		this.userRepository = userRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(Oauth2CustomApplication.class, args);
	}

	@Bean
	public CommandLineRunner startup(RoleRepository roleRepository) {
		return args -> {
			Role role = new Role(1,"USER");
			Set<Role> roles = new HashSet<>();
			roles.add(role);
			roleRepository.save(role);
		};

	}

}

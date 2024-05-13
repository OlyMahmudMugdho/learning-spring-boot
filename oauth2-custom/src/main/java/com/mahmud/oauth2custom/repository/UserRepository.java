package com.mahmud.oauth2custom.repository;

import com.mahmud.oauth2custom.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}

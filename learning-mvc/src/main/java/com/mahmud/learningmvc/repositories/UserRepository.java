package com.mahmud.learningmvc.repositories;

import com.mahmud.learningmvc.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}

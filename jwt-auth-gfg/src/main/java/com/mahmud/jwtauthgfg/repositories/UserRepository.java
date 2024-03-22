package com.mahmud.jwtauthgfg.repositories;

import com.mahmud.jwtauthgfg.models.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
}

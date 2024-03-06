package com.mahmud.REST.API.learning.repository;

import com.mahmud.REST.API.learning.entities.AuthorEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <AuthorEntity, Long> {
}

package com.mahmud.REST.API.learning.services;

import com.mahmud.REST.API.learning.entities.AuthorEntity;

import java.util.Optional;

public interface AuthorService {
    Optional<AuthorEntity> getAuthor(long id);
    AuthorEntity createAuthor(AuthorEntity author);
}

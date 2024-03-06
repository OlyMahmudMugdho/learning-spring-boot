package com.mahmud.REST.API.learning.services;

import com.mahmud.REST.API.learning.entities.AuthorEntity;

public interface AuthorService {
    AuthorEntity getAuthor(long id);
    AuthorEntity createAuthor(AuthorEntity author);
}

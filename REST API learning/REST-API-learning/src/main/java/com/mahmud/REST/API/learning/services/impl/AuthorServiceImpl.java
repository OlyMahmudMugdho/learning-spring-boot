package com.mahmud.REST.API.learning.services.impl;

import com.mahmud.REST.API.learning.entities.AuthorEntity;
import com.mahmud.REST.API.learning.repository.AuthorRepository;
import com.mahmud.REST.API.learning.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    AuthorRepository authorRepository;

    AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity getAuthor(long id) {
        return null;
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity author) {
        authorRepository.save(author);
        return author;
    }
}

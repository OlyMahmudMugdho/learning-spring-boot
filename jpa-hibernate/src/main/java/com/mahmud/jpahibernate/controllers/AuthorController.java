package com.mahmud.jpahibernate.controllers;

import com.mahmud.jpahibernate.domain.Author;
import com.mahmud.jpahibernate.repository.AuthorRepository;
import org.springframework.data.repository.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController implements Repository<Author, String> {

    final private AuthorRepository authorRepository;

    final private Author author;

    AuthorController(AuthorRepository authorRepository, Author author) {
        this.authorRepository = authorRepository;
        this.author = author;
    }

    @GetMapping("/create-author")
    public void createAuthor() {
        author.setName("Mugdho");
        author.setAge(23);
        authorRepository.save(author);
    }
}

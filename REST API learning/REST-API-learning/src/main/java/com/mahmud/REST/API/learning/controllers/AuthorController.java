package com.mahmud.REST.API.learning.controllers;

import com.mahmud.REST.API.learning.entities.AuthorEntity;
import com.mahmud.REST.API.learning.services.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("/authors")
    public ResponseEntity<AuthorEntity> createAuthor(@RequestBody AuthorEntity author) {
       AuthorEntity entity = authorService.createAuthor(author);
       return new ResponseEntity<>(entity, HttpStatus.CREATED);
    }
}

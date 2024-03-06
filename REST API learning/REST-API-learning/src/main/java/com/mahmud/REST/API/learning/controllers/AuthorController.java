package com.mahmud.REST.API.learning.controllers;

import com.mahmud.REST.API.learning.entities.AuthorEntity;
import com.mahmud.REST.API.learning.services.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping("/authors/{id}")
    public ResponseEntity<AuthorEntity> getAuthorById(@PathVariable("id") Long id) {
        Optional<AuthorEntity> foundAuthor = authorService.getAuthor(id);
        if(foundAuthor.isPresent()) {
            AuthorEntity authorEntity = foundAuthor.get();
            return new ResponseEntity<>(authorEntity, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
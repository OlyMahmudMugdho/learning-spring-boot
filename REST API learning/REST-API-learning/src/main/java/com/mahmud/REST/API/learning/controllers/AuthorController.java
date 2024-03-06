package com.mahmud.REST.API.learning.controllers;

import com.mahmud.REST.API.learning.dto.AuthorDto;
import com.mahmud.REST.API.learning.entities.AuthorEntity;
import com.mahmud.REST.API.learning.mappers.Mapper;
import com.mahmud.REST.API.learning.mappers.impl.AuthorMapper;
import com.mahmud.REST.API.learning.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class AuthorController {
    AuthorService authorService;

    Mapper<AuthorEntity,AuthorDto> authorMapper;


    public AuthorController(AuthorService authorService, Mapper<AuthorEntity,AuthorDto> authorMapper) {
        this.authorService = authorService;
        this.authorMapper = authorMapper;
    }


    @PostMapping("/authors")
    public ResponseEntity<AuthorEntity> createAuthor(@RequestBody AuthorEntity author) {
        AuthorEntity entity = authorService.createAuthor(author);
        return new ResponseEntity<>(entity, HttpStatus.CREATED);
    }

    @GetMapping("/authors/{id}")
    public ResponseEntity<AuthorDto> getAuthorById(@PathVariable("id") Long id) {
        Optional<AuthorEntity> foundAuthor = authorService.getAuthor(id);
        if(foundAuthor.isPresent()) {
            AuthorEntity authorEntity = foundAuthor.get();
            return new ResponseEntity<>(authorMapper.mapFrom(authorEntity), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
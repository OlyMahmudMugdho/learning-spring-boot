package com.mahmud.junit_learning.controller;

import com.mahmud.junit_learning.model.Author;
import com.mahmud.junit_learning.model.Book;
import com.mahmud.junit_learning.repository.AuthorRepository;
import com.mahmud.junit_learning.service.AuthorService;
import com.mahmud.junit_learning.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAuthors();
    }

    @PostMapping
    public Author addAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }
}

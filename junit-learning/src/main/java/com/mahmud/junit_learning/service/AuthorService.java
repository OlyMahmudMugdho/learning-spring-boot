package com.mahmud.junit_learning.service;

import com.mahmud.junit_learning.model.Author;
import com.mahmud.junit_learning.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    public Author updateAuthor(Author author) {
        return authorRepository.update(author);
    }

    public void deleteAuthor(Long id) {
        authorRepository.delete(id);
    }
}

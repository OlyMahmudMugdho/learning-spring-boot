package com.mahmud.junit_learning.repository;

import com.mahmud.junit_learning.model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepository {
    private List<Author> authors = new ArrayList<>();
    
    public Author save(Author author) {
        authors.add(author);
        return author;
    }
    
    public List<Author> findAll() {
        return authors;
    }
    
    public Author findById(Long id) {
        return authors.stream().filter(author -> author.getId().equals(id)).findFirst().orElse(null);
    }
    
    public Author update(Author author) {
        Author foundAuthor = findById(author.getId());
        if (foundAuthor == null) {
            return null;
        }
        foundAuthor.setName(author.getName());
        foundAuthor.setBooks(author.getBooks());
        return foundAuthor;
    }
    
    public void delete(Long id) {
        Author foundAuthor = findById(id);
        if (foundAuthor == null) {
            return;
        }
        authors.remove(foundAuthor);
    }
}

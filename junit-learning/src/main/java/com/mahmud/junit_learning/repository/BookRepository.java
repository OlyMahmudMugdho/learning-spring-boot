package com.mahmud.junit_learning.repository;

import com.mahmud.junit_learning.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class BookRepository {
    private List<Book> books = new ArrayList<>();
    
    public Book save(Book book) {
        books.add(book);
        return book;
    }
    
    public List<Book> findAll() {
        return books;
    }
    
    public Book findById(Long id) {
        for (Book book : books) {
            if (Objects.equals(book.getId(), id)) {
                return book;
            }
        }
        return null;
    }
    
    public Book update(Book book) {
        Book foundBook = findById(book.getId());
        if (foundBook == null) {
            return null;
        }
        foundBook.setTitle(book.getTitle());
        foundBook.setAuthor(book.getAuthor());
        return foundBook;
    }
    
    public Book delete(Long id) {
        for (Book book : books) {
            if (Objects.equals(book.getId(), id)) {
                books.remove(book);
                return book;
            }
        }
        return null;
    }
    
}

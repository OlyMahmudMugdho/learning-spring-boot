package com.mahmud.junit_learning.repository;

import com.mahmud.junit_learning.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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

    public List<Book> findBooksByAuthor(Long authorId) {
        return books.stream().filter(Objects::nonNull).filter(book -> book.getAuthor().getId().equals(authorId)).toList();
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
    
    public void delete(Long id) {
        books.removeIf(book -> Objects.equals(book.getId(), id));
    }
    
}

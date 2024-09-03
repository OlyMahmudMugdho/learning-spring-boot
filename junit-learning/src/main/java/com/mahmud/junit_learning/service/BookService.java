package com.mahmud.junit_learning.service;

import com.mahmud.junit_learning.model.Book;
import com.mahmud.junit_learning.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBookById(Long id) {
        bookRepository.delete(id);
    }

    public List<Book> findBooksByAuthor(Long authorId) {
        return bookRepository.findBooksByAuthor(authorId);
    }
}

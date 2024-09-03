package com.mahmud.junit_learning.controller;

import com.mahmud.junit_learning.model.Author;
import com.mahmud.junit_learning.model.Book;
import com.mahmud.junit_learning.service.AuthorService;
import com.mahmud.junit_learning.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {
    private final BookService bookService;
    private final AuthorService authorService;

    public BookController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        Author author = authorService.getAuthorById(book.getAuthor().getId());
        System.out.println(author);
        book.setAuthor(author);

        return bookService.addBook(book);
    }

}

package com.baeldung.controller;

import com.baeldung.model.Book;
import com.baeldung.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    List<Book> findAllBooks() {
        return bookService.findAllBooks();
    }

    @GetMapping("/{bookId}")
    public Book findBook(@PathVariable Long bookId) {
        log.info("bookId: {}", bookId);
        return bookService.findBookById(bookId);
    }

    // Postman - Basic Auth  Username: user   Password: 39e128a3-0bbc-4c6f-ac5f-aa7e494b8f6b
    // Using generated security password
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
    }

    @PutMapping("/{bookId}")
    public Book updateBook(@RequestBody Book book, @PathVariable Long bookId) {
        return bookService.updateBook(book, bookId);
    }

    @PatchMapping("/{bookId}")
    public Book updateBook(
            @RequestBody Map<String, String> updates,
            @PathVariable Long bookId) {
        return bookService.updateBook((Book) updates, bookId);
    }
}
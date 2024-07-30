package com.baeldung.service;

import com.baeldung.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

@Slf4j
@Service
public class BookService {


    private static final Map<Long, Book> books = new HashMap<Long, Book>() {

        private static final long serialVersionUID = -3970206781360313502L;

        {
            put(111L, new Book(111L, "Proces", "Kafka"));
            put(222L, new Book(222L, "Sala", "Kundera"));
        }
    };

    public List<Book> findAllBooks() {
        //In Book data Map - values are result, not Keys
        return books.values().stream().collect(Collectors.toList());
    }

    public Book findBookById(Long bookId) {
        if (books.get(bookId) != null) {
            log.info("bookId: {}", bookId);
            return books.get(bookId);
        }
        return null;
    }

    public Book createBook(Book book) {
        // Long id = Long.valueOf(getRandomNumber());

        Random random = new Random();
        int min = 1;
        int max = 10000;
        long id = random.nextInt(max - min) + min;

        log.info("id: {}", id);
        Book newBook = new Book(id, book.getTitle(), book.getAuthor());
        books.put(id, newBook);
        return newBook;
    }

    public void deleteBook(Long bookId) {
        books.remove(bookId);
    }

    public Book updateBook(Book book, Long bookId) {
        if (findBookById(bookId).getId() != bookId) {
            return null;
        }
        books.put(Long.valueOf(Math.toIntExact(bookId)), book);
        return book;
    }

    public static int getRandomNumber() {
        int x = (int) Math.random();
        return x;
    }
}

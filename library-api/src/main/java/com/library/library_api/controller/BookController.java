package com.library.library_api.controller;

import com.library.library_api.model.Book;
import com.library.library_api.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    @GetMapping("/{id}")
public Book getBookById(@PathVariable Long id) {
    return bookRepository.findById(id).orElse(null);
}
@PutMapping("/{id}")
public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
    book.setId(id);
    return bookRepository.save(book);
}

@DeleteMapping("/{id}")
public void deleteBook(@PathVariable Long id) {
    bookRepository.deleteById(id);
}
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }
}

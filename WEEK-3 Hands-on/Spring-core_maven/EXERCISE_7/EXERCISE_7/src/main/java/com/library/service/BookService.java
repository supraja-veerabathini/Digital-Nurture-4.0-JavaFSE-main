package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String bookCategory;

    // Constructor injection
    public BookService(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    // Setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        System.out.println("BookService: Adding book in category: " + bookCategory);
        bookRepository.save(title);
    }
}

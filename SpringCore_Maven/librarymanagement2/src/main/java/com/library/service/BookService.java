package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    public void DisplayBookService(){
        System.out.println("This is Book Service");
        bookRepository.DisplayBookRepository();
    }
}

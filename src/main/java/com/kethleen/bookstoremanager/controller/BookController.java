package com.kethleen.bookstoremanager.controller;

import com.kethleen.bookstoremanager.dto.MessageResponseDTO;
import com.kethleen.bookstoremanager.entity.Book;
import com.kethleen.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
        return bookService.create(book);
    }

}

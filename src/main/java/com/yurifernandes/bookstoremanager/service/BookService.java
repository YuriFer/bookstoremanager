package com.yurifernandes.bookstoremanager.service;

import org.springframework.stereotype.Service;

import com.yurifernandes.bookstoremanager.dto.MessageResponseDTO;
import com.yurifernandes.bookstoremanager.entity.Book;
import com.yurifernandes.bookstoremanager.repository.BookRepository;

@Service
public class BookService {

    private BookRepository bookRepository;

    //@Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book){
        Book savedBook = bookRepository.save(book);

        return MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId())
                .build();
    }
}

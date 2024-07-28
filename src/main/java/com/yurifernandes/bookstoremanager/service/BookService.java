package com.yurifernandes.bookstoremanager.service;

import org.springframework.stereotype.Service;

import com.yurifernandes.bookstoremanager.dto.BookDTO;
import com.yurifernandes.bookstoremanager.dto.MessageResponseDTO;
import com.yurifernandes.bookstoremanager.entity.Book;
import com.yurifernandes.bookstoremanager.mapper.BookMapper;
import com.yurifernandes.bookstoremanager.repository.BookRepository;

@Service
public class BookService {

    private BookRepository bookRepository;
    private BookMapper bookMapper = BookMapper.INSTANCE;

    public BookService(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    public MessageResponseDTO create(BookDTO bookDTO){

        // Book bookToSave = Book.builder()
        //         .name(bookDTO.getName())
        //         .pages(bookDTO.getPages())
        //         .chapters(bookDTO.getChapters())
        //         .isbn(bookDTO.getIsbn())
        //         .publisherName(bookDTO.getPublisherName())
        //         .author(bookDTO.getAuthor())
        //         .build();

        Book bookToSave = bookMapper.toModel(bookDTO);

        Book savedBook = bookRepository.save(bookToSave);

        return MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId())
                .build();
    }
}

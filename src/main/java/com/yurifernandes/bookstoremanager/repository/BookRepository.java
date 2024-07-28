package com.yurifernandes.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yurifernandes.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}

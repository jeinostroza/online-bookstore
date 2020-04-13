package com.jeinostroza.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeinostroza.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}

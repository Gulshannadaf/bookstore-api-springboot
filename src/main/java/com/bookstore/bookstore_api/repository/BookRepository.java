package com.bookstore.bookstore_api.repository;

import com.bookstore.bookstore_api.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}


package com.bookstore.repository;

import com.bookstore.model.Book;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book save(Book book);

    List<Book> findAll();

    Optional<Book> findById(Long id);
}

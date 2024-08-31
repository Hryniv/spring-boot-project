package com.bookstore.service;

import com.bookstore.dto.BookDto;
import com.bookstore.dto.BookSearchParametersDto;
import com.bookstore.dto.CreateBookRequestDto;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface BookService {
    BookDto save(CreateBookRequestDto requestDto);

    List<BookDto> findAll(Pageable pageable);

    BookDto findById(Long id);

    void deleteById(Long id);

    BookDto updateBook(Long id, CreateBookRequestDto requestDto);

    List<BookDto> search(BookSearchParametersDto searchParametersDto, Pageable pageable);
}

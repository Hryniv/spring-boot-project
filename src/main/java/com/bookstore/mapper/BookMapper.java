package com.bookstore.mapper;

import com.bookstore.config.MapperConfig;
import com.bookstore.dto.BookDto;
import com.bookstore.dto.CreateBookRequestDto;
import com.bookstore.model.Book;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.data.domain.Page;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    List<BookDto> toListDto(List<Book> books);

    List<BookDto> pageToListDto(Page<Book> page);

    Book toModel(CreateBookRequestDto requestDto);

    void updateBookFromDto(@MappingTarget Book book, CreateBookRequestDto requestDto);
}

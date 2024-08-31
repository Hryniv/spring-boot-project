package com.bookstore.dto;

import com.bookstore.validation.CustomIsbn;
import jakarta.validation.constraints.Min;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class CreateBookRequestDto {
    private String title;
    private String author;
    @CustomIsbn
    private String isbn;
    @Min(value = 0)
    private BigDecimal price;
    private String description;
    private String coverImage;
}

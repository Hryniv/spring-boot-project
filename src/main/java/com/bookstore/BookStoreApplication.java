package com.bookstore;

import com.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookStoreApplication {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(BookStoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            //Book book = new Book();
            //book.setAuthor("Taras Shevchenko");
            //book.setPrice(BigDecimal.ONE);
            //book.setIsbn("778-3-16-148410-0");
            //book.setDescription("description");
            //book.setTitle("Kobzar");
            //book.setCoverImage("images");

            //bookService.save(book);
            //bookService.findAll().forEach(System.out::println);
        };
    }
}

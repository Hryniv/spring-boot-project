package com.bookstore.repository.book;

import com.bookstore.dto.BookSearchParametersDto;
import com.bookstore.model.Book;
import com.bookstore.repository.SpecificationBuilder;
import com.bookstore.repository.SpecificationProviderManager;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BookSpecificationBuilder implements SpecificationBuilder<Book> {
    private final SpecificationProviderManager<Book> specificationProviderManager;

    @Override
    public Specification<Book> build(BookSearchParametersDto searchParameters) {
        Specification<Book> sp = Specification.where(null);
        if (searchParameters.author() != null) {
            sp = sp.and(specificationProviderManager.getSpecificationProvider("author")
                    .getSpecification(searchParameters.author()));
        }
        if (searchParameters.title() != null) {
            sp = sp.and(specificationProviderManager.getSpecificationProvider("title")
                    .getSpecification(searchParameters.title()));
        }
        return sp;
    }
}

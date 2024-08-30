package com.bookstore.repository.book;

import com.bookstore.exception.SpecProviderNotFoundException;
import com.bookstore.model.Book;
import com.bookstore.repository.SpecificationProvider;
import com.bookstore.repository.SpecificationProviderManager;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BookSpecificationProviderManager implements SpecificationProviderManager<Book> {
    private final List<SpecificationProvider<Book>> specificationProviders;

    @Override
    public SpecificationProvider<Book> getSpecificationProvider(String key) {
        return specificationProviders.stream()
                .filter(provider -> provider.getKey().equals(key))
                .findFirst()
                .orElseThrow(() ->
                        new SpecProviderNotFoundException(
                                "Can't find correct specification provider by key " + key));
    }
}

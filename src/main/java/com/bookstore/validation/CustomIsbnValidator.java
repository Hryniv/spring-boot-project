package com.bookstore.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class CustomIsbnValidator implements ConstraintValidator<CustomIsbn, String> {
    /**
     * Examples that are corresponding to PATTERN_ISBN
     * 0-306-40615-2
     * 0306406152
     * 1-56619-909-3
     * 1566199093
     * 3-16-148410-X
     * 316148410X
     */
    private static final String PATTERN_ISBN =
            "^(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)"
                    + "[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$";

    @Override
    public boolean isValid(String isbn, ConstraintValidatorContext constraintValidatorContext) {
        return isbn != null && Pattern.compile(PATTERN_ISBN).matcher(isbn).matches();
    }
}

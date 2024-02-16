package com.ecommerce.ecommercerestapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class EmailExistException extends ResponseStatusException {
    public EmailExistException() {
        super(
            HttpStatus.BAD_REQUEST, 
            "Email already exists!"
        );
    }
}

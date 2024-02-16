package com.ecommerce.ecommercerestapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(EmailExistException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public EmailExistException handlerEmailExistException() {
        return new EmailExistException();
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public NotFoundException handlerNotFoundException() {
        return new NotFoundException();
    }
}

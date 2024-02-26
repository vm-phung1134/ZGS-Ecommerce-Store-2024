package com.ecommerce.ecommercerestapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class EmailOrPasswordInvalidException extends ResponseStatusException {
    public EmailOrPasswordInvalidException (){
        super(
            HttpStatus.NOT_ACCEPTABLE, 
            "Account or password invalid!"
        );
    }
}

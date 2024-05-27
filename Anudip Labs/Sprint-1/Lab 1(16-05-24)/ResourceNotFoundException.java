package com.companyname.springbootcrudrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// This annotation marks this class to respond with HTTP status 404 (NOT_FOUND) when thrown.
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{

    private static final long serialVersionUID = 1L;

    // Constructor to create an instance of ResourceNotFoundException with a custom message.
    public ResourceNotFoundException(String message){
        super(message);
    }
}
package com.companyname.springbootcrudrest.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    // This method handles ResourceNotFoundException and returns a ResponseEntity with an ErrorDetails object and HTTP status code 404 (NOT_FOUND).
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
		// Create an ErrorDetails object with the current date, exception message, and request description.
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		// Return a ResponseEntity containing the ErrorDetails object and HTTP status code 404.
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}

    // This method handles generic exceptions and returns a ResponseEntity with an ErrorDetails object and HTTP status code 500 (INTERNAL_SERVER_ERROR).
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globleExcpetionHandler(Exception ex, WebRequest request) {
		// Create an ErrorDetails object with the current date, exception message, and request description.
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		// Return a ResponseEntity containing the ErrorDetails object and HTTP status code 500.
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

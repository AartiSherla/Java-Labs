package com.companyname.springbootcrudrest.exception;

import java.util.Date;

// Class to represent error details
public class ErrorDetails {
    private Date timestamp; // Timestamp of the error
    private String message; // Error message
    private String details; // Details about the error

    // Constructor
    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    // Getter for timestamp
    public Date getTimestamp() {
        return timestamp;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Getter for details
    public String getDetails() {
        return details;
    }
}
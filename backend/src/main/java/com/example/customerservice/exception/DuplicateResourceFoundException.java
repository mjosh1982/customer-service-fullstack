package com.example.customerservice.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception thrown when an attempt to create or modify a resource results in a conflict
 * due to a duplicate resource being found.
 */
@ResponseStatus(code = org.springframework.http.HttpStatus.CONFLICT)
public class DuplicateResourceFoundException extends RuntimeException{

    /**
     * Constructs a new DuplicateResourceFoundException with the specified detail message.
     *
     * @param message the detail message that explains the reason for the exception.
     */
    public DuplicateResourceFoundException(String message) {
        super(message);
    }
}

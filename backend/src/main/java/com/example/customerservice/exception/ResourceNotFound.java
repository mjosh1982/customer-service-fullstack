package com.example.customerservice.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * Exception class representing a resource-not-found error.
 * This exception is thrown when a requested resource cannot be found in the system
 * and returns an HTTP 404 Not Found response.
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException {
    /**
     * Constructs a new ResourceNotFound exception with a detailed message.
     *
     * @param message The detail message explaining the reason for the exception.
     */
    public ResourceNotFound(String message) {
        super(message);
    }
}

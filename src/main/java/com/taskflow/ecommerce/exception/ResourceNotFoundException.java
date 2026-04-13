package com.taskflow.ecommerce.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message, int id) {
        super(message + " not found with id: " + id);
    }
}

package com.kol92v.spring.crud.exceptionhandling.exception;

public abstract class EntityRequestException extends RuntimeException {
    public EntityRequestException(String message) {
        super(message);
    }
}

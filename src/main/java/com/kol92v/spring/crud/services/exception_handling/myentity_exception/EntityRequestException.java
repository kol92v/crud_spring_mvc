package com.kol92v.spring.crud.services.exception_handling.myentity_exception;

public abstract class EntityRequestException extends RuntimeException {
    public EntityRequestException(String message) {
        super(message);
    }
}

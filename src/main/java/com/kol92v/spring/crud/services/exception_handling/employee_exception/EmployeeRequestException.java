package com.kol92v.spring.crud.services.exception_handling.employee_exception;

public abstract class EmployeeRequestException extends RuntimeException {
    public EmployeeRequestException(String message) {
        super(message);
    }
}

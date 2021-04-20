package com.kol92v.spring.crud.services.exception_handling;

import com.kol92v.spring.crud.services.exception_handling.employee_exception.EmployeeRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectRequest> handleException(EmployeeRequestException exception) {
        EmployeeIncorrectRequest employeeIncorrectRequest = new EmployeeIncorrectRequest(exception.getMessage());
        return new ResponseEntity<>(employeeIncorrectRequest, HttpStatus.BAD_REQUEST);
    }
}

package com.kol92v.spring.crud.exceptionhandling;


import com.kol92v.spring.crud.exceptionhandling.exception.EntityRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice
public class MyEntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<MyEntityIncorrectRequest> handleException(EntityRequestException exception) {
        MyEntityIncorrectRequest myEntityIncorrectRequest = new MyEntityIncorrectRequest(exception.getMessage());
        return new ResponseEntity<>(myEntityIncorrectRequest, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<MyEntityIncorrectRequest> handleException(SQLIntegrityConstraintViolationException exception) {
        MyEntityIncorrectRequest myEntityIncorrectRequest = new MyEntityIncorrectRequest(exception.getMessage());
        return new ResponseEntity<>(myEntityIncorrectRequest, HttpStatus.BAD_REQUEST);
    }
}

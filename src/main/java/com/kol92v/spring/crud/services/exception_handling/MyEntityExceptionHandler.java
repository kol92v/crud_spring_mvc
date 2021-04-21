package com.kol92v.spring.crud.services.exception_handling;


import com.kol92v.spring.crud.services.exception_handling.myentity_exception.EntityRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyEntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<MyEntityIncorrectRequest> handleException(EntityRequestException exception) {
        MyEntityIncorrectRequest myEntityIncorrectRequest = new MyEntityIncorrectRequest(exception.getMessage());
        return new ResponseEntity<>(myEntityIncorrectRequest, HttpStatus.BAD_REQUEST);
    }
}

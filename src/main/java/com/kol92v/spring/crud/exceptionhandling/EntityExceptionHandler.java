package com.kol92v.spring.crud.exceptionhandling;


import com.kol92v.spring.crud.exceptionhandling.exception.EntityRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice
public class EntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<EntityIncorrectRequest> handleException(EntityRequestException exception) {
        EntityIncorrectRequest entityIncorrectRequest = new EntityIncorrectRequest(exception.getMessage());
        return new ResponseEntity<>(entityIncorrectRequest, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity<EntityIncorrectRequest> handleException(SQLIntegrityConstraintViolationException exception) {
        EntityIncorrectRequest entityIncorrectRequest = new EntityIncorrectRequest(exception.getMessage());
        return new ResponseEntity<>(entityIncorrectRequest, HttpStatus.BAD_REQUEST);
    }
}

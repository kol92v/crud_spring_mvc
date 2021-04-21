package com.kol92v.spring.crud.exceptionhandling.exception;

public class GetEntityException extends EntityRequestException {

    public GetEntityException(int id) {
        super("There is no entity with ID = " +
                id + " in Database");
    }
}

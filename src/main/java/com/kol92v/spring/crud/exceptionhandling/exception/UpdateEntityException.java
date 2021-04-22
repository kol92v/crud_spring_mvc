package com.kol92v.spring.crud.exceptionhandling.exception;

import com.kol92v.spring.crud.entity.Entity;

public class UpdateEntityException extends EntityRequestException {

    public UpdateEntityException(Entity myEntity) {
        super("There is no entity in Database: " +
                myEntity);
    }
}

package com.kol92v.spring.crud.exceptionhandling.exception;

import com.kol92v.spring.crud.entity.Entity;

public class SaveEntityException extends EntityRequestException {

    public SaveEntityException(Entity myEntity) {
        super("This entity is present in " +
                "Database already: " + myEntity);
    }
}

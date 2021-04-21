package com.kol92v.spring.crud.services.exception_handling.myentity_exception;

import com.kol92v.spring.crud.entity.MyEntity;

public class SaveEntityException extends EntityRequestException {

    public SaveEntityException(MyEntity myEntity) {
        super("This entity is present in " +
                "Database already: " + myEntity);
    }
}

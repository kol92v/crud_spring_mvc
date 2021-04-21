package com.kol92v.spring.crud.exceptionhandling.exception;

import com.kol92v.spring.crud.entity.MyEntity;

public class UpdateEntityException extends EntityRequestException {

    public UpdateEntityException(MyEntity myEntity) {
        super("There is no entity in Database: " +
                myEntity);
    }
}

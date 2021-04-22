package com.kol92v.spring.crud.exceptionhandling;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class EntityIncorrectRequest {
    private String info;
}

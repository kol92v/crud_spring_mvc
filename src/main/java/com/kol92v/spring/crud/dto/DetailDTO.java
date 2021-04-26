package com.kol92v.spring.crud.dto;

import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class DetailDTO implements DTO {

    private int id;
    private String city;
    private int age;
    private String sex;
}

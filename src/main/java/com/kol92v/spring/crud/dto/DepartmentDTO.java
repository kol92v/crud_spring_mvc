package com.kol92v.spring.crud.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DepartmentDTO implements DTO {

    private int id;
    private String name;
//    private List<Employee> employees;
}

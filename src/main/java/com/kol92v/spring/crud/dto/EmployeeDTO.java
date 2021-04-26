package com.kol92v.spring.crud.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class EmployeeDTO implements DTO {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private DepartmentDTO departmentDTO;
    private DetailDTO detailDTO;
}

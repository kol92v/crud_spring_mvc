package com.kol92v.spring.crud.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DepartmentDTO implements DTO {

    private int id;
    private String name;
}

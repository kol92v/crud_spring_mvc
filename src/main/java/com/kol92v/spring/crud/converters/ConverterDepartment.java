package com.kol92v.spring.crud.converters;

import com.kol92v.spring.crud.dto.DepartmentDTO;
import com.kol92v.spring.crud.entity.Department;
import org.springframework.stereotype.Component;

@Component
public class ConverterDepartment implements ConverterEntityDTO<DepartmentDTO, Department>{

    @Override
    public DepartmentDTO convert(Department entity) {
        return DepartmentDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }

    @Override
    public Department convert(DepartmentDTO dto) {
        return Department.builder()
                .id(dto.getId())
                .name(dto.getName())
                .build();
    }
}

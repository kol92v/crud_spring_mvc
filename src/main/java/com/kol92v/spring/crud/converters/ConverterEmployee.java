package com.kol92v.spring.crud.converters;

import com.kol92v.spring.crud.dto.EmployeeDTO;
import com.kol92v.spring.crud.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class ConverterEmployee implements ConverterEntityDTO<EmployeeDTO, Employee>{

    @Override
    public EmployeeDTO convert(Employee entity) {
        return EmployeeDTO.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .salary(entity.getSalary())
                .build();
    }

    @Override
    public Employee convert(EmployeeDTO dto) {
        return Employee.builder()
                .id(dto.getId())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .salary(dto.getSalary())
                .build();
    }
}

package com.kol92v.spring.crud.converters;

import com.kol92v.spring.crud.dto.EmployeeDTO;
import com.kol92v.spring.crud.entity.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ConverterEmployee implements ConverterEntityDTO<EmployeeDTO, Employee>{
    private final ConverterDepartment converterDepartment;
    private final ConverterDetail converterDetail;

    @Override
    public EmployeeDTO convert(Employee entity) {
        EmployeeDTO employeeDTO = EmployeeDTO.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .salary(entity.getSalary())
                .departmentDTO(converterDepartment.convert(entity.getDepartment()))
                .build();
        if (entity.getDetail() != null) {
            employeeDTO.setDetailDTO(converterDetail.convert(entity.getDetail()));
        }
        return employeeDTO;
    }

    @Override
    public Employee convert(EmployeeDTO dto) {
        Employee employee = Employee.builder()
                .id(dto.getId())
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .salary(dto.getSalary())
                .department(new ConverterDepartment().convert(dto.getDepartmentDTO()))
                .build();
        if (dto.getDetailDTO() != null) {
            employee.setDetail(new ConverterDetail().convert(dto.getDetailDTO()));
        }
        return employee;
    }
}
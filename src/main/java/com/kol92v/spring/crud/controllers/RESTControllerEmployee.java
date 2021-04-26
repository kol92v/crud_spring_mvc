package com.kol92v.spring.crud.controllers;

import com.kol92v.spring.crud.converters.ConverterEntityDTO;
import com.kol92v.spring.crud.dao.EmployeeRepository;
import com.kol92v.spring.crud.dto.EmployeeDTO;
import com.kol92v.spring.crud.entity.Employee;
import com.kol92v.spring.crud.services.CRUDService;
import com.kol92v.spring.crud.services.CRUDServiceEmployee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class RESTControllerEmployee extends MainRestController<Employee, EmployeeDTO, EmployeeRepository>{
    public RESTControllerEmployee(@Qualifier("CRUDServiceEmployee") CRUDService<Employee, EmployeeRepository> crudService,
                                  @Qualifier("converterEmployee") ConverterEntityDTO<EmployeeDTO, Employee> converterEntityDTO) {
        super(crudService, converterEntityDTO);
    }

    private final CRUDServiceEmployee crudServiceEmployee = (CRUDServiceEmployee) crudService;

    @GetMapping("/department_id={id}")
    public List<EmployeeDTO> getEmployeesFromDepartment(@PathVariable int id) {
        List<Employee> employeesFromDepartment = crudServiceEmployee.getEmployeesFromDepartment(id);
        return converterEntityDTO.convertToDTO(employeesFromDepartment);
    }
}

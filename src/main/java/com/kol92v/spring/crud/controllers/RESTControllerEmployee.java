package com.kol92v.spring.crud.controllers;

import com.kol92v.spring.crud.dao.EmployeeRepository;
import com.kol92v.spring.crud.entity.Employee;
import com.kol92v.spring.crud.services.CRUDService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class RESTControllerEmployee extends MainRestController<Employee, EmployeeRepository>{
    public RESTControllerEmployee(@Qualifier("CRUDServiceEmployee") CRUDService<Employee, EmployeeRepository> crudService) {
        super(crudService);
    }
}

package com.kol92v.spring.crud.controllers;


import com.kol92v.spring.crud.dao.DepartmentRepository;
import com.kol92v.spring.crud.entity.Department;
import com.kol92v.spring.crud.services.CRUDService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/departments")
public class RESTControllerDepartment extends MainRestController<Department, DepartmentRepository>{
    public RESTControllerDepartment(@Qualifier("CRUDServiceDepartment") CRUDService<Department, DepartmentRepository> crudService) {
        super(crudService);
    }
}

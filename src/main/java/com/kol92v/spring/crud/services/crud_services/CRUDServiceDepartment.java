package com.kol92v.spring.crud.services.crud_services;

import com.kol92v.spring.crud.dao.DepartmentRepository;
import com.kol92v.spring.crud.entity.Department;
import org.springframework.stereotype.Service;

@Service
public class CRUDServiceDepartment extends CRUDService<Department, DepartmentRepository> {
    public CRUDServiceDepartment(DepartmentRepository repository) {
        super(repository);
    }
}

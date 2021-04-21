package com.kol92v.spring.crud.services.crud_services;

import com.kol92v.spring.crud.dao.EmployeeRepository;
import com.kol92v.spring.crud.entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class CRUDServiceEmployee extends CRUDService<Employee, EmployeeRepository> {
    public CRUDServiceEmployee(EmployeeRepository repository) {
        super(repository);
    }
}

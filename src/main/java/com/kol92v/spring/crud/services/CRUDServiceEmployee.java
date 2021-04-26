package com.kol92v.spring.crud.services;

import com.kol92v.spring.crud.dao.EmployeeRepository;
import com.kol92v.spring.crud.entity.Employee;
import com.kol92v.spring.crud.exceptionhandling.exception.GetEntityException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CRUDServiceEmployee extends CRUDService<Employee, EmployeeRepository> {
    public CRUDServiceEmployee(EmployeeRepository repository) {
        super(repository);
    }

    public List<Employee> getEmployeesFromDepartment(int id) {
        List<Employee> employeesByDepartmentId = repository.findAllByDepartment_Id(id);
        if (employeesByDepartmentId.size() == 0) throw new GetEntityException(id);
        return employeesByDepartmentId;
    }
}
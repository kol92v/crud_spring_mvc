package com.kol92v.spring.crud.services;

import com.kol92v.spring.crud.entity.Employee;

import java.util.List;

public interface EmployeeCRUDService {

    Employee save(Employee employee);

    Employee update(Employee employee);

    void delete(int id);

    List<Employee> getEmployees();

    Employee getEmployee(int id);
}

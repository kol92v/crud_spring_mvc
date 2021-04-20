package com.kol92v.spring.crud.services;

import com.kol92v.spring.crud.dao.EmployeeRepository;
import com.kol92v.spring.crud.entity.Employee;
import com.kol92v.spring.crud.services.exception_handling.employee_exception.GetEmployeeException;
import com.kol92v.spring.crud.services.exception_handling.employee_exception.SaveEmployeeException;
import com.kol92v.spring.crud.services.exception_handling.employee_exception.UpdateEmployeeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EmployeeCRUDServiceImpl implements EmployeeCRUDService{

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeCRUDServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    private boolean isPresentEmpInBase(Employee employee) {
        return isPresentEmpInBase(employee.getId());
    }

    private boolean isPresentEmpInBase(int id) {
        if (id == 0) return false;
        try {
            employeeRepository.getOne(id);
            return true;
        } catch (EntityNotFoundException e) {
            return false;
        }
    }


    @Override
    public Employee save(Employee employee) {
        if (isPresentEmpInBase(employee)) {
            throw new SaveEmployeeException(employee);
        } else {
            return employeeRepository.save(employee);
        }
    }

    @Override
    public Employee update(Employee employee) {
        if (!isPresentEmpInBase(employee)) {
            throw new UpdateEmployeeException(employee); //TODO create my exception
        } else {
            return employeeRepository.save(employee);
        }

    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(int id) {
        if (isPresentEmpInBase(id)) {
            return employeeRepository.getOne(id);
        } else {
            throw new GetEmployeeException(id); //TODO create my exception
        }
    }
}

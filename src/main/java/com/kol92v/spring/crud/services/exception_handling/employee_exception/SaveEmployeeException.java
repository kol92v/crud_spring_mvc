package com.kol92v.spring.crud.services.exception_handling.employee_exception;

import com.kol92v.spring.crud.entity.Employee;

public class SaveEmployeeException extends EmployeeRequestException {

    public SaveEmployeeException(Employee employee) {
        super("This employee is present in " +
                "Database already: " + employee);
    }
}

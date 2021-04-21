package com.kol92v.spring.crud.services.exception_handling.employee_exception;

import com.kol92v.spring.crud.entity.Employee;

public class UpdateEmployeeException extends EmployeeRequestException {

    public UpdateEmployeeException(Employee employee) {
        super("There is no employee in Database: " +
                employee);
    }
}

package com.kol92v.spring.crud.services.exception_handling.employee_exception;

public class GetEmployeeException extends EmployeeRequestException {

    public GetEmployeeException(int id) {
        super("There is no employee with ID = " +
                id + " in Database");
    }
}

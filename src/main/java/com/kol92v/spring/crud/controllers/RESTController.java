package com.kol92v.spring.crud.controllers;

import com.kol92v.spring.crud.entity.Employee;
import com.kol92v.spring.crud.services.EmployeeCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {
    private EmployeeCRUDService employeeCRUDService;

    @Autowired
    public RESTController(EmployeeCRUDService employeeCRUDService) {
        this.employeeCRUDService = employeeCRUDService;
    }

    @PostMapping("/employees")
    public Employee save(@RequestBody Employee employee) {
        return employeeCRUDService.save(employee);
    }

    @PutMapping("/employees")
    public Employee update(@RequestBody Employee employee) {
        Employee update = employeeCRUDService.update(employee);
        System.out.println("hey");
        return update;
    }

    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable int id) {
        employeeCRUDService.delete(id);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeCRUDService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeCRUDService.getEmployee(id);
    }
}

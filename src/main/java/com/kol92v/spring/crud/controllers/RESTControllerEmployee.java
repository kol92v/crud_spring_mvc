package com.kol92v.spring.crud.controllers;

import com.kol92v.spring.crud.entity.Employee;
import com.kol92v.spring.crud.services.crud_services.CRUDServiceEmployee;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class RESTControllerEmployee {
    private final CRUDServiceEmployee crudServiceServiceEmployee;

    @PostMapping("/")
    public Employee save(@RequestBody Employee employee) {
        return crudServiceServiceEmployee.save(employee);
    }

    @PutMapping("/")
    public Employee update(@RequestBody Employee employee) {
        return crudServiceServiceEmployee.update(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        crudServiceServiceEmployee.delete(id);
    }

    @GetMapping("/")
    public List<Employee> getEmployees() {
        return crudServiceServiceEmployee.getAllEntity();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return crudServiceServiceEmployee.getEntity(id);
    }
}

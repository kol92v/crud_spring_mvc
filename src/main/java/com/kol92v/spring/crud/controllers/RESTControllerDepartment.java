package com.kol92v.spring.crud.controllers;

import com.kol92v.spring.crud.entity.Department;
import com.kol92v.spring.crud.services.crud_services.CRUDServiceDepartment;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@AllArgsConstructor
public class RESTControllerDepartment {
    private final CRUDServiceDepartment crudServiceDepartment;

    @PostMapping("/")
    public Department save(@RequestBody Department department) {
        return crudServiceDepartment.save(department);
    }

    @PutMapping("/")
    public Department update(@RequestBody Department department) {
        return crudServiceDepartment.update(department);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        crudServiceDepartment.delete(id);
    }

    @GetMapping("/")
    public List<Department> getDepartments() {
        return crudServiceDepartment.getAllEntity();
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable int id) {
        return crudServiceDepartment.getEntity(id);
    }

}

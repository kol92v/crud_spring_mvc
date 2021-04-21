package com.kol92v.spring.crud.controllers;


import com.kol92v.spring.crud.entity.Detail;
import com.kol92v.spring.crud.entity.Employee;
import com.kol92v.spring.crud.services.crud_services.CRUDServiceDetails;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/details")
public class RESTControllerDetails {

    private final CRUDServiceDetails crudServiceDetails;

    @PostMapping("/")
    public Detail save(@RequestBody Detail detail) {
        return crudServiceDetails.save(detail);
    }

    @PutMapping("/")
    public Detail update(@RequestBody Detail detail) {
        return crudServiceDetails.update(detail);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        crudServiceDetails.delete(id);
    }

    @GetMapping("/")
    public List<Detail> getDetails() {
        return crudServiceDetails.getAllEntity();
    }

    @GetMapping("/{id}")
    public Detail getDetail(@PathVariable int id) {
        return crudServiceDetails.getEntity(id);
    }
}

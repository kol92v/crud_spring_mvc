package com.kol92v.spring.crud.controllers;

import com.kol92v.spring.crud.entity.MyEntity;
import com.kol92v.spring.crud.services.CRUDService;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
public abstract class MainRestController<Entity extends MyEntity, Repository extends JpaRepository<Entity, Integer>> {
    protected final CRUDService<Entity, Repository> crudService;

    @PostMapping("/")
    public Entity save(@RequestBody Entity entity) {
        return crudService.save(entity);
    }

    @PutMapping("/")
    public Entity update(@RequestBody Entity entity) {
        return crudService.update(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        crudService.delete(id);
    }

    @GetMapping("/")
    public List<Entity> getAllEntity() {
        return crudService.getAllEntity();
    }

    @GetMapping("/{id}")
    public Entity getEntity(@PathVariable int id) {
        return crudService.getEntity(id);
    }

}

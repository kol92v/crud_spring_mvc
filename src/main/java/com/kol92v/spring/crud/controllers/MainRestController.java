package com.kol92v.spring.crud.controllers;

import com.kol92v.spring.crud.converters.ConverterEntityDTO;
import com.kol92v.spring.crud.dto.DTO;
import com.kol92v.spring.crud.entity.Entity;
import com.kol92v.spring.crud.services.CRUDService;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
public abstract class MainRestController<E extends Entity, D extends DTO, R extends JpaRepository<E, Integer>> {
    protected final CRUDService<E, R> crudService;
    protected final ConverterEntityDTO<D, E> converterEntityDTO;

    @PostMapping("/")
    public D save(@RequestBody D dto) {
        E entity = converterEntityDTO.convert(dto);
        return converterEntityDTO.convert(crudService.save(entity));
    }

    @PutMapping("/")
    public D update(@RequestBody D dto) {
        E entity = converterEntityDTO.convert(dto);
        return converterEntityDTO.convert(crudService.update(entity));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        crudService.delete(id);
    }

    @GetMapping("/")
    public List<D> getAllEntity() {
        return converterEntityDTO.convertToDTO(crudService.getAllEntity());
    }

    @GetMapping("/{id}")
    public D getEntity(@PathVariable int id) {
        return converterEntityDTO.convert(crudService.getEntity(id));
    }

}

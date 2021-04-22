package com.kol92v.spring.crud.services;

import com.kol92v.spring.crud.entity.Entity;
import com.kol92v.spring.crud.exceptionhandling.exception.GetEntityException;
import com.kol92v.spring.crud.exceptionhandling.exception.SaveEntityException;
import com.kol92v.spring.crud.exceptionhandling.exception.UpdateEntityException;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


@AllArgsConstructor
public abstract class CRUDService<E extends Entity, R extends JpaRepository<E, Integer>> {

    protected final R repository;

    protected boolean isPresentEntityInBase(E entity) {
        return repository.findById(entity.getId()).isPresent();
    }

    public E save(E entity) {
        if (isPresentEntityInBase(entity)) {
            throw new SaveEntityException(entity);
        } else {
            return repository.save(entity);
        }
    }

    public E update(E entity) {
        if (!isPresentEntityInBase(entity)) {
            throw new UpdateEntityException(entity);
        } else {
            return repository.save(entity);
        }
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public List<E> getAllEntity() {
        return repository.findAll();
    }

    public E getEntity(int id) {
        return repository.findById(id).orElseThrow(() -> new GetEntityException(id));
    }

}

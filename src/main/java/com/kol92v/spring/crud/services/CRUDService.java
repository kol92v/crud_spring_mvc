package com.kol92v.spring.crud.services;

import com.kol92v.spring.crud.entity.MyEntity;
import com.kol92v.spring.crud.exceptionhandling.exception.GetEntityException;
import com.kol92v.spring.crud.exceptionhandling.exception.SaveEntityException;
import com.kol92v.spring.crud.exceptionhandling.exception.UpdateEntityException;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


@AllArgsConstructor
public abstract class CRUDService<Entity extends MyEntity, Repository extends JpaRepository<Entity, Integer>> {

    protected final Repository repository;

    protected boolean isPresentEntityInBase(Entity myEntity) {
        return repository.findById(myEntity.getId()).isPresent();
    }

    public Entity save(Entity myEntity) {
        if (isPresentEntityInBase(myEntity)) {
            throw new SaveEntityException(myEntity);
        } else {
            return repository.save(myEntity);
        }
    }

    public Entity update(Entity myEntity) {
        if (!isPresentEntityInBase(myEntity)) {
            throw new UpdateEntityException(myEntity);
        } else {
            return repository.save(myEntity);
        }
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public List<Entity> getAllEntity() {
        return repository.findAll();
    }

    public Entity getEntity(int id) {
        return repository.findById(id).orElseThrow(() -> new GetEntityException(id));
    }

}

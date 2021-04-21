package com.kol92v.spring.crud.services.crud_services;

import com.kol92v.spring.crud.entity.MyEntity;
import com.kol92v.spring.crud.services.exception_handling.myentity_exception.GetEntityException;
import com.kol92v.spring.crud.services.exception_handling.myentity_exception.SaveEntityException;
import com.kol92v.spring.crud.services.exception_handling.myentity_exception.UpdateEntityException;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;



@AllArgsConstructor
public abstract class CRUDService<Entity extends MyEntity, Repository extends JpaRepository<Entity, Integer>> {
    
    protected final Repository repository;

    protected boolean isPresentEntityInBase(Entity myEntity) {
        return isPresentEntityInBase(myEntity.getId());
    }

    protected boolean isPresentEntityInBase(int id) {
        if (id == 0) return false;
        Optional<Entity> entityFromBase = repository.findById(id);
        return entityFromBase.isPresent();

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
        if (isPresentEntityInBase(id)) {
            return repository.findById(id).get();
        } else {
            throw new GetEntityException(id);
        }
    }
    
    
}

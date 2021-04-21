package com.kol92v.spring.crud.services;

import com.kol92v.spring.crud.dao.DetailRepository;
import com.kol92v.spring.crud.entity.Detail;
import org.springframework.stereotype.Service;

@Service
public class CRUDServiceDetails extends CRUDService<Detail, DetailRepository> {
    public CRUDServiceDetails(DetailRepository repository) {
        super(repository);
    }
}

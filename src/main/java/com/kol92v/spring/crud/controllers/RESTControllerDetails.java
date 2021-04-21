package com.kol92v.spring.crud.controllers;


import com.kol92v.spring.crud.dao.DetailRepository;
import com.kol92v.spring.crud.entity.Detail;
import com.kol92v.spring.crud.services.crud_services.CRUDService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/details")
public class RESTControllerDetails extends MainRestController<Detail, DetailRepository> {
    public RESTControllerDetails(@Qualifier("CRUDServiceDetails") CRUDService<Detail, DetailRepository> crudService) {
        super(crudService);
    }
}

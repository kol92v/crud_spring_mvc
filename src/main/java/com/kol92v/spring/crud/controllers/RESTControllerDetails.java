package com.kol92v.spring.crud.controllers;


import com.kol92v.spring.crud.converters.ConverterEntityDTO;
import com.kol92v.spring.crud.dao.DetailRepository;
import com.kol92v.spring.crud.dto.DetailDTO;
import com.kol92v.spring.crud.entity.Detail;
import com.kol92v.spring.crud.services.CRUDService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/details")
public class RESTControllerDetails extends MainRestController<Detail, DetailDTO, DetailRepository> {

    public RESTControllerDetails(@Qualifier("CRUDServiceDetails") CRUDService<Detail, DetailRepository> crudService,
                                 @Qualifier("converterDetail") ConverterEntityDTO<DetailDTO, Detail> converterEntityDTO) {
        super(crudService, converterEntityDTO);
    }
}

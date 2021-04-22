package com.kol92v.spring.crud.converters;

import com.kol92v.spring.crud.dto.DetailDTO;
import com.kol92v.spring.crud.entity.Detail;
import org.springframework.stereotype.Component;

@Component
public class ConverterDetail implements ConverterEntityDTO<DetailDTO, Detail>{
    @Override
    public DetailDTO convert(Detail entity) {
        return DetailDTO.builder()
                .id(entity.getId())
                .city(entity.getCity())
                .age(entity.getAge())
                .sex(entity.getSex())
                .build();
    }

    @Override
    public Detail convert(DetailDTO dto) {
        return Detail.builder()
                .id(dto.getId())
                .city(dto.getCity())
                .age(dto.getAge())
                .sex(dto.getSex())
                .build();
    }
}

package com.kol92v.spring.crud.converters;

import com.kol92v.spring.crud.dto.DTO;
import com.kol92v.spring.crud.entity.Entity;
import java.util.List;
import java.util.stream.Collectors;


public interface ConverterEntityDTO<D extends DTO, E extends Entity> {
     D convert(E entity);
     E convert(D dto);

     default List<D> convert(List<E> allEntity) {
          return allEntity.stream().map(this::convert).collect(Collectors.toList());
     }
}

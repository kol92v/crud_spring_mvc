package com.kol92v.spring.crud.dao;

import com.kol92v.spring.crud.entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailRepository extends JpaRepository<Detail, Integer> {

}

package com.kol92v.spring.crud.dao;

import com.kol92v.spring.crud.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}

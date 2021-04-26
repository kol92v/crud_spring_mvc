package com.kol92v.spring.crud.dao;

import com.kol92v.spring.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByDepartment_Id(int id);
}

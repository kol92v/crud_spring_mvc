package com.kol92v.spring.crud.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "departments")
@Data
public class Department implements MyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "department",
            cascade = CascadeType.ALL)
    private List<Employee> employees;
}

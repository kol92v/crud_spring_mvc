package com.kol92v.spring.crud.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name = "departments")
@Data
@Builder
@NoArgsConstructor
public class Department implements Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

//    @OneToMany(mappedBy = "department",
//            cascade = CascadeType.ALL)
//    private List<Employee> employees;
}

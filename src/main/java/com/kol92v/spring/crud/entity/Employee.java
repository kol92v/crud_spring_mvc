package com.kol92v.spring.crud.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name = "employees")
@Data
@Builder
@NoArgsConstructor
public class Employee implements Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "salary")
    private int salary;

//    @Column(name = "department_id")
//    private int department;

//    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.DETACH})
//    @JoinColumn(name = "department_id")
//    private Department department;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id")
//    private Detail detail;
}

package com.kol92v.spring.crud.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "details")
@Data
public class Detail implements MyEntity{

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "age")
    private int age;

    @Column(name = "sex")
    private String sex;

//    @OneToOne(mappedBy = "detail",
//    cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
//    private Employee employee;

}

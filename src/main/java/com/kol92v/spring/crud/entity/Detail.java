package com.kol92v.spring.crud.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

}

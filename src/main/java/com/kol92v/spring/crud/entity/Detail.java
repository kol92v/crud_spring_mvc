package com.kol92v.spring.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name = "details")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Detail implements Entity {

    @Id
    @Column(name = "id_det")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "age")
    private int age;

    @Column(name = "sex")
    private String sex;

}

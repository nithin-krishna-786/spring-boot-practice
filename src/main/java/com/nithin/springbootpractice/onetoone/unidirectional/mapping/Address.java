package com.nithin.springbootpractice.onetoone.unidirectional.mapping;

import lombok.Data;


import jakarta.persistence.*;

@Data
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}

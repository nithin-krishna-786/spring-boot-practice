package com.nithin.springbootpractice.fetchtype.lazy;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
//@Table(name = "employees")
public class Employee {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "employee")
    private List<Project> projects;
    
    // Constructors, getters, setters, and other methods
}
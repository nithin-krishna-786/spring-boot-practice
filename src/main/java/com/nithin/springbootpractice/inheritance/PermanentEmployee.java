package com.nithin.springbootpractice.inheritance;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "permanent_employees")
@Data
public class PermanentEmployee extends Employee {

    @Column(name = "pf_number")
    private String pfNumber;

    @Column(name = "joining_date")
    private LocalDate joiningDate;

    @Column(name = "annual_salary")
    private double annualSalary;

    // Getters and Setters
}

package com.nithin.springbootpractice.composition;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "libraries")
@Data
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
//    In Composition, if u dont give mappedBy/@joinColumn, 
//    it creates a sepearte join table with 2 entites 
    @OneToMany(cascade = CascadeType.ALL)
    private List<Book> books;

    // Getters and Setters
}
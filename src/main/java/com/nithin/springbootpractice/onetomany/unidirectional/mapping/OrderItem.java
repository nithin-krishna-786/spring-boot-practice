package com.nithin.springbootpractice.onetomany.unidirectional.mapping;

import lombok.*;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String imageUrl;
    private BigDecimal price;
    private int quantity;
}

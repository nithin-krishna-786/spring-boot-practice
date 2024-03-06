package com.nithin.springbootpractice.comparator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	
	private String name;
	private Integer pid;
	private Double price;

}

package com.nithin.springbootpractice.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000d));
		productsList.add(new Product(2, "Dell Laptop", 30000d));
		productsList.add(new Product(3, "Lenevo Laptop", 28000d));
		productsList.add(new Product(4, "Sony Laptop", 28000d));
		productsList.add(new Product(5, "Apple Laptop", 90000d));

		// Prod price less than 30000

		List<Double> pricesLT30000 = productsList.stream().filter(p -> p.getPrice() < 30000)
				.filter(p -> p.getName().contains("e")).map(Product::getPrice).collect(Collectors.toList());

		for (Double p : pricesLT30000) {
			System.out.println(p);
		}

		// Collectors to Map

		Map<String, Double> productPriceMap = productsList.stream()
				.collect(Collectors.toMap(Product::getName, Product::getPrice));

		System.out.println(productPriceMap);
	}
	
	
	
	
}

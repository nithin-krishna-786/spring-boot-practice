package com.nithin.springbootpractice.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		Product p1 = new Product("Prod1", 1, 25.5);
		Product p2 = new Product("Prod2", 2, 19.99);
		Product p3 = new Product("Prod3", 3, 34.95);

		Comparator<Product> productComparator = Comparator.comparing(Product::getPid).thenComparing(Product::getName)
				.thenComparing(Product::getPrice,Comparator.reverseOrder());
		
		List<Product> products = new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		Collections.sort(products,productComparator);
		
		for(Product p:products)
		{
			System.out.print(p);
		}
		
	}

}

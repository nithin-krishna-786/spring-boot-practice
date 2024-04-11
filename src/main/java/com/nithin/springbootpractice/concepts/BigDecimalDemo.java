package com.nithin.springbootpractice.concepts;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {

	      // Creating BigDecimal objects with specified values
        BigDecimal num1 = new BigDecimal("0.0000000000000000000001");
        BigDecimal num2 = new BigDecimal("0.");

        // Performing arithmetic operations with high precision
        BigDecimal sum = num1.add(num2); // Addition
        BigDecimal difference = num2.subtract(num1); // Subtraction
        BigDecimal product = num1.multiply(num2); // Multiplication

        // Displaying the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
	}

}

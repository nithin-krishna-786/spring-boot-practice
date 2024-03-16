package com.nithin.springbootpractice.async;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.jcabi.aspects.Loggable;

public class CompletableFutureDemo {


	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// CompletableFuture Example
		CompletableFuture<Long> completableFuture = factorialUsingCompletableFuture(7);
		System.out.println("Factorial of 7 is: " + completableFuture.get());

		CompletableFuture<Long> completableFuture2 = factorialUsingCompletableFuture(8);
		System.out.println("Factorial of 8 is: " + completableFuture2.get());

		CompletableFuture<Long> completableFuture3 = factorialUsingCompletableFuture(9);
		System.out.println("Factorial of 9 is: " + completableFuture3.get());

	}

	@Loggable
	public static CompletableFuture<Long> factorialUsingCompletableFuture(int number) {
		CompletableFuture<Long> completableFuture = CompletableFuture.supplyAsync(() -> factorial(number));
		return completableFuture;
	}
	
	public static long factorial(int number) {
		long result = 1;
		for (int i = number; i > 0; i--) {
			result *= i;
		}
		return result;
	}

}

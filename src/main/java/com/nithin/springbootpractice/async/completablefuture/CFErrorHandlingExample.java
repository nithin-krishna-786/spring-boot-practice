package com.nithin.springbootpractice.async.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CFErrorHandlingExample {

	public static void main(String[] args) {
		CompletableFuture.supplyAsync(() -> {
			if (true)
				throw new RuntimeException("Something went wrong!");
			return "Success";
		}).exceptionally(ex -> {
			System.out.println("Error: " + ex.getMessage());
			return "Fallback result";
		}).thenAccept(System.out::println);
	}

}

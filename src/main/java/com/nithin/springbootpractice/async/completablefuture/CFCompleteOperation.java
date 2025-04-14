package com.nithin.springbootpractice.async.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CFCompleteOperation {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Create a CompletableFuture using supplyAsync
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(5000); // Simulate some delay
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt(); // Restore interrupted status
			}
			return "withinTheFuture";
		});
		// Complete the CompletableFuture manually
		completableFuture.complete("Hello, World!");

		// Get the result (blocks if not completed)
		String result = completableFuture.get();
		System.out.println(result); // Output: Hello, World!

	}

}

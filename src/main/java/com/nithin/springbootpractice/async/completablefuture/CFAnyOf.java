package com.nithin.springbootpractice.async.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CFAnyOf {
	public static void main(String[] args) {
		// Create three CompletableFutures
		CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return 1;
		});
		CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 2);
		CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return 3;
		});

		// Combine futures using anyOf (first one to complete)
		CompletableFuture<Object> anyFuture = CompletableFuture.anyOf(future1, future2, future3);

		// Get the first completed result
		anyFuture.thenAccept(result -> System.out.println("First completed result: " + result)).join();
	}
}

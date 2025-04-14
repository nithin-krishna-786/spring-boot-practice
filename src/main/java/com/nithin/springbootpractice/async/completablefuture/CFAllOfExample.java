package com.nithin.springbootpractice.async.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CFAllOfExample {
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
        // Combine all futures using allOf
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1, future2, future3);

        // Wait for all futures to complete and collect results
        allFutures.thenRun(() -> {
            try {
                Integer result1 = future1.get();
                Integer result2 = future2.get();
                Integer result3 = future3.get();
                System.out.println("Results: " + result1 + ", " + result2 + ", " + result3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).join(); // Block until all futures are completed
        
    }
}

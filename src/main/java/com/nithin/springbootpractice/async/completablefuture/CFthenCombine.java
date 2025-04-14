package com.nithin.springbootpractice.async.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CFthenCombine {

	  public static void main(String[] args) throws Exception {
	        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 20);
	        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 22);

	        // Combine results of two futures
	        CompletableFuture<Integer> combined = future1.thenCombine(future2, Integer::sum);

	        System.out.println("Combined Result: " + combined.get()); // Output: Combined Result: 42
	  }     
}

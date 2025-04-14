package com.nithin.springbootpractice.async.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CFThenApply {
	
	 public static void main(String[] args) throws Exception {
	        

	        // Run an asynchronous task
	        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
	            try {
	                TimeUnit.SECONDS.sleep(5); // Simulate delay
	            } catch (InterruptedException e) {
	                throw new IllegalStateException(e);
	            }
	            return "Hello, Async!";
	        });

	        // Attach a transformation using thenApply()
	        CompletableFuture<String> transformedFuture = future.thenApply(result -> result + " - Transformed");

	        // Block and get the result
	        System.out.println(transformedFuture.get()); // Output: Hello, Async! - Transformed
	    }

}

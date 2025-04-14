package com.nithin.springbootpractice.async.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CFChainingTasksExample {

	 public static void main(String[] args) {
	        CompletableFuture.supplyAsync(() -> "Task 1")
	                .thenApply(result -> result + " + Task 2")  //SIMILAR TO map()
	                .thenApply(result -> result + " + Task 3")
	                .thenAccept(System.out::println);           //SIMILAR TO forEach()
	    }
}

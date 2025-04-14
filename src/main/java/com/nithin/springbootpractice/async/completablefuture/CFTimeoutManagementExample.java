package com.nithin.springbootpractice.async.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CFTimeoutManagementExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5); // Simulate a long-running task
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result after delay";
        })
        .orTimeout(2, TimeUnit.SECONDS) // Apply a timeout of 2 seconds
        .exceptionally(ex -> "Timeout occurred"); // Handle timeout or other exceptions

        String result = future.get(); // Block until the task completes
        System.out.println(result);
    }
}


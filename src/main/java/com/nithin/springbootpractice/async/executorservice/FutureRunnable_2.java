package com.nithin.springbootpractice.async.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FutureRunnable_2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task = () -> {
            try {
                Thread.sleep(3000); // Simulate a task taking 3 seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Task Completed");
        };

// Use submit() to execute the Runnable and get a Future
        executor.execute(task);

        System.out.println("Waiting for the task to complete...");
        System.out.println("Task has been completed successfully!");

        executor.shutdown();
    }
}

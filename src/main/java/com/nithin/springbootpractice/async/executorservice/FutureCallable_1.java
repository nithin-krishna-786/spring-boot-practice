package com.nithin.springbootpractice.async.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCallable_1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        Callable<String> task = () -> {
            Thread.sleep(3000);
            return "Task Completed";
        };

        Future<String> future = executor.submit(task);
        //NOTE
        // submit() for Callable
        // execute() for Runnable
        System.out.println("Waiting for the task to complete...");
        System.out.println("Result: " + future.get()); // Blocks until the task completes

        executor.shutdown();
    }
}

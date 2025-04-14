package com.nithin.springbootpractice.async.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample_7 {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> callableTask = () -> {
        	Thread.sleep(3000);
            System.out.println("Callable Task executed by: " + Thread.currentThread().getName());
            return 42; // Return some result
        };

        Future<Integer> futureResult = executor.submit(callableTask);
        System.out.println("Result from Callable: " + futureResult.get()); // Blocks until result is available
        executor.shutdown();
    }
}


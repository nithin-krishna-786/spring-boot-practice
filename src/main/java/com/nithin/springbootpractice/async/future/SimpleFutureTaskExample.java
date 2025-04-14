package com.nithin.springbootpractice.async.future;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class SimpleFutureTaskExample {
    public static void main(String[] args) {
        // Define a Callable task
        Callable<String> callableTask = () -> {
            System.out.println("Task started...");
            try {
                Thread.sleep(5000); // Simulate a long-running task
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Task completed!";
        };

        // Create a FutureTask with the Callable
        FutureTask<String> futureTask = new FutureTask<>(callableTask);

        // Execute the task synchronously in the main thread
        futureTask.run();

        try {
            // Retrieve the result of the task using futureTask.get()
        	System.out.println("Before printing Result");
            String result = futureTask.get(); // Does not block since task is already completed
            System.out.println("Result from FutureTask: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


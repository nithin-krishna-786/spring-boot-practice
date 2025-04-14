package com.nithin.springbootpractice.async.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample_3 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable task1 = () -> System.out.println("Task 1 executed by: " + Thread.currentThread().getName());
        Runnable task2 = () -> System.out.println("Task 2 executed by: " + Thread.currentThread().getName());
        Runnable task3 = () -> System.out.println("Task 3 executed by: " + Thread.currentThread().getName());

        executor.execute(task1);
        executor.execute(task2);
        executor.execute(task3);

        executor.shutdown();
    }
}


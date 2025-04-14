package com.nithin.springbootpractice.async.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample_5 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.execute(() -> System.out.println("Task " + taskId + " executed by: " + Thread.currentThread().getName()));
        }

        executor.shutdown();
    }
}

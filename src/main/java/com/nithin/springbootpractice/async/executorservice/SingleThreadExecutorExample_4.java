package com.nithin.springbootpractice.async.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample_4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable task = () -> {
        	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        	System.out.println("Task executed by: " + Thread.currentThread().getName());
        };
        System.out.println("Before executing the Task: ");
        executor.execute(task);
        System.out.println("After executing the Task: ");
        executor.shutdown();
    }
}

package com.nithin.springbootpractice.async.executorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample_6 {
	
	  public static void main(String[] args) {
	        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);

	        Runnable task1 = () -> System.out.println("Scheduled Task1 executed by: " + Thread.currentThread().getName());
	        Runnable task2 = () -> System.out.println("Scheduled Task2 executed by: " + Thread.currentThread().getName());

	        scheduler.schedule(task1, 3, TimeUnit.SECONDS); // Executes after 3 seconds
	        scheduler.schedule(task2, 5, TimeUnit.SECONDS); // Executes after 5 seconds
	        scheduler.shutdown();
	    }

}

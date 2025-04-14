package com.nithin.springbootpractice.async.executorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllExample_8 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		List<Callable<String>> tasks = new ArrayList<>();
		
		tasks.add(() -> {
			Thread.sleep(2000);
			return "Task 1 completed";
		});
		
		tasks.add(() -> {
			Thread.sleep(2000);
			return "Task 2 completed";
		});
		
		tasks.add(() -> {
			Thread.sleep(2000);
			return "Task 3 completed";
		});

		List<Future<String>> results = executor.invokeAll(tasks);

		for (Future<String> result : results) {
			System.out.println(result.get());
		}

		executor.shutdown();
	}
}

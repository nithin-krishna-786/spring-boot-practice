package com.nithin.springbootpractice.async.executorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAnyExample_9 {
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

		String result = executor.invokeAny(tasks);

		System.out.println(result);

		executor.shutdown();
	}
}

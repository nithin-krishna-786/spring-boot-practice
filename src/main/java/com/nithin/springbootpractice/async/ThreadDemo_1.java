package com.nithin.springbootpractice.async;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.jcabi.aspects.Loggable;

public class ThreadDemo_1 {

//	  static {
//	        com.ea.async.Async.init();
//	    }

	private static final ExecutorService threadpool = Executors.newCachedThreadPool();

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// Thread Example
		factorialUsingThread(5).start();
		factorialUsingThread(7).start();
		factorialUsingThread(9).start();
		factorialUsingThread(11).start();
		factorialUsingThread(13).start();

		// FutureTask Example
//	        Future<Long> futureTask = factorialUsingFutureTask(number);
//	        System.out.println("Factorial of " + number + " is: " + futureTask.get());

//	        // CompletableFuture Example
//	        Future<Long> completableFuture = factorialUsingCompletableFuture(number);
//	        System.out.println("Factorial of " + number + " is: " + completableFuture.get());
//
//	        // EA Async example
//	        System.out.println("Factorial of " + number + " is: " + factorialUsingEAAsync(number));
//
//	        // cactoos async example
//	        Future<Long> asyncFuture = factorialUsingCactoos(number);
//	        System.out.println("Factorial of " + number + " is: " + asyncFuture.get());
//
//	        // Guava example
//	        ListenableFuture<Long> guavaFuture = factorialUsingGuavaServiceSubmit(number);
//	        System.out.println("Factorial of " + number + " is: " + guavaFuture.get());
//
//	        ListenableFuture<Long> guavaFutures = factorialUsingGuavaFutures(number);
//	        System.out.println("Factorial of " + number + " is: " + guavaFutures.get());
//
//	        // @async jcabi-aspect example
//	        Future<Long> aspectFuture = factorialUsingJcabiAspect(number);
//	        System.out.println("Factorial of " + number + " is: " + aspectFuture.get());

	}

	public static long factorial(int number) {
		long result = 1;
		for (int i = number; i > 0; i--) {
			result *= i;
		}
		return result;
	}

	@Loggable
	public static Thread factorialUsingThread(int number) {
		Thread newThread = new Thread(() -> {
			System.out.println("Factorial of " + number + " is: " + factorial(number));
		});

		return newThread;
	}

}

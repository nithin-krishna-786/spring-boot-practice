package com.nithin.springbootpractice.async;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;

public class FactorialCalculator {

    public static void main(String[] args) throws Exception {
        int number = 10; // calculate factorial for this number

        // Normal method
        long startTime = System.currentTimeMillis();
        long result = calculateFactorial(number);
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;

        System.out.println("Factorial of " + number + " (Normal): " + result);
        System.out.println("Time taken (Normal): " + timeTaken + " ms");

        // CompletableFuture method
        Instant startInstant = Instant.now();
        CompletableFuture<Long> future = calculateFactorialAsync(number);
        Long asyncResult = future.get(); // Wait for the result
        Instant endInstant = Instant.now();
        Duration duration = Duration.between(startInstant, endInstant);

        System.out.println("Factorial of " + number + " (CompletableFuture): " + asyncResult);
        System.out.println("Time taken (CompletableFuture): " + duration.toMillis() + " ms");
    }

    public static long calculateFactorial(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static CompletableFuture<Long> calculateFactorialAsync(int number) {
        return CompletableFuture.supplyAsync(() -> {
            long result = 1;
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        });
    }
}

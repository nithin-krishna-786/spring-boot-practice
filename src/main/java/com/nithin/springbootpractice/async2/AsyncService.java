package com.nithin.springbootpractice.async2;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;
import java.util.concurrent.CompletableFuture;

@EnableAsync
@Service
public class AsyncService {

    @Async
    public CompletableFuture<String> asyncMethodWithReturnType() {
        System.out.println("Execute method asynchronously - " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000); // Simulate delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return CompletableFuture.completedFuture("hello world !!!! " + Thread.currentThread().getName());
    }
}


package com.nithin.springbootpractice.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogApplication {

    private static final Logger log = LoggerFactory.getLogger(LogApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LogApplication.class, args);

        // Example usage of log levels
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.error("This is an error message");

        // Logging with parameters
        String name = "John Doe";
        int age = 30;
        log.info("User details: name={}, age={}", name, age);

        // Logging exceptions
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            log.error("Error occurred", e);
        }
    }
}
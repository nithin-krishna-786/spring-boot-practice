package com.nithin.springbootpractice.datetime;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        // Current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Specific date
        LocalDate specificDate = LocalDate.of(2022, 3, 15);
        System.out.println("Specific Date: " + specificDate);

        // Adding days to a date
        LocalDate futureDate = currentDate.plusDays(30);
        System.out.println("Date 30 days from now: " + futureDate);
    }
}


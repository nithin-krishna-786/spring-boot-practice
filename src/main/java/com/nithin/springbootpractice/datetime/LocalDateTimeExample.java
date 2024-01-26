package com.nithin.springbootpractice.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // Current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Specific date and time
        LocalDateTime specificDateTime = LocalDateTime.of(2022, 5, 20, 15, 30);
        System.out.println("Specific Date and Time: " + specificDateTime);

        // Formatting date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // Adding days and hours to a date and time
        LocalDateTime futureDateTime = currentDateTime.plusDays(10).plusHours(5);
        System.out.println("Date and Time 10 days and 5 hours from now: " + futureDateTime);
    }
}


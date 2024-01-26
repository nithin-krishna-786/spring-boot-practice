package com.nithin.springbootpractice.datetime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        // Current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Specific time
        LocalTime specificTime = LocalTime.of(12, 30, 45);
        System.out.println("Specific Time: " + specificTime);

        // Adding hours to a time
        LocalTime futureTime = currentTime.plusHours(3);
        System.out.println("Time 3 hours from now: " + futureTime);
    }
}


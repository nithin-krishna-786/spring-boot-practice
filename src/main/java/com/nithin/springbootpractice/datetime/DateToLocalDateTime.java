package com.nithin.springbootpractice.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateTime {
	 public static void main(String[] args) {
	        // Example Date
	        Date date = new Date();

	        // Convert Date to LocalDateTime
	        LocalDateTime localDateTime = convertToLocalDateTime(date);

	        // Display the result
	        System.out.println("Original Date: " + date);
	        System.out.println("Converted LocalDateTime: " + localDateTime);
	    }

	    // Function to convert Date to LocalDateTime
	    public static LocalDateTime convertToLocalDateTime(Date date) {
	        // Convert Date to Instant
	        Instant instant = date.toInstant();

	        // Specify a time zone (you can use other time zones based on your requirements)
	        ZoneId zoneId = ZoneId.systemDefault();

	        // Convert Instant to LocalDateTime
	        return LocalDateTime.ofInstant(instant, zoneId);
	    }
}

package com.nithin.springbootpractice.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateTimeToDate {

	public static void main(String[] args) {
		// Example LocalDateTime
		LocalDateTime localDateTime = LocalDateTime.of(2022, 5, 15, 14, 30);

		// Convert LocalDateTime to Date
		Date date = convertToDate(localDateTime);

		// Display the result
		System.out.println("LocalDateTime: " + localDateTime);
		System.out.println("Converted Date: " + date);
	}
	
	  public static Date convertToDate(LocalDateTime localDateTime) {
	        // Define a time zone (you can use other time zones based on your requirements)
	        ZoneId zoneId = ZoneId.systemDefault();

	        // Convert LocalDateTime to Instant
	        Instant instant = localDateTime.atZone(zoneId).toInstant();

	        // Convert Instant to Date
	        return Date.from(instant);
	    }

}

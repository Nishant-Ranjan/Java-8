package com.epam.learning;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class Java8_Date {
	
	public static void main(String args[]) {
		
		//a universal time scale
		//used for critical process to run at fixed times on the time-line
		Instant instant = Instant.now();
		
		//use for date mathematics
		LocalDateTime localDateTime = LocalDateTime.now();
		
		//actual point in time, but in a specific area of the world
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(instant);
		System.out.println(localDateTime);
		System.out.println(zonedDateTime);
		
		
		Instant instant1 = Instant.parse("2018-12-01T16:01:13.419Z");
		Instant instant2 = Instant.parse("2018-12-17T15:17:22.305Z");
		System.out.println(Duration.between(instant1,instant2).toDays());
		System.out.println(Duration.between(instant1,instant2).toHours());
		
		
		//conversion java.util.Date to java.util.LocalDateTime
		Instant inst = new Date().toInstant();
		LocalDateTime ldt = LocalDateTime.ofInstant(inst, ZoneId.systemDefault());
		System.out.println(ldt);
		
		//conversion to localdate
		System.out.println(ldt.toLocalDate());
		
		//conversion to localtime
		System.out.println(ldt.toLocalTime());
		
		//consversion of localdatetime to java.util.date
		Date date = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println(date);
	}

}

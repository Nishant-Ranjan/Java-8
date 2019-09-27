package com.epam.learning;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//The mentioned annotation marks it as an Functional Interace
//If we try to add any more abstract method it will throw complilation errors
@FunctionalInterface
public interface SampleFunctionalInterface {
	public abstract int calculate(char ch);
	
	//Default and static methods in an interface
	
	default String concateNames(String firstName, String secondName) {		
		return firstName.concat(" ").concat(secondName);
	}
	
	static Long getDurationBetweenTwoDates(LocalDateTime date1, LocalDateTime date2) {
		return Duration.between(date1, date2).toDays();
	}
}

package com.epam.learning;

import java.time.LocalDateTime;

public class Java8_Interfaces {
	
	public static void main(String[] args) {
		SampleFunctionalInterface sampleFunctionalInterface = new SampleFunctionalInterfaceImpl();
		System.out.println(sampleFunctionalInterface.concateNames("John", "Doe"));// Overrides the default method of the interface
		System.out.println(SampleFunctionalInterface.getDurationBetweenTwoDates(LocalDateTime.now(), LocalDateTime.now().plusDays(3)));
	}
}

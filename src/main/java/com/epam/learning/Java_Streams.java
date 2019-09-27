package com.epam.learning;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java_Streams {
	
	public static void main(String args[]) {
		
		//Integer Steam
//		IntStream.range(1, 1000).forEach(System.out::println);
		
		//Integer stream with skip
//		IntStream.range(0, 1000).skip(100).forEach(System.out::println);
		
		//Integr stream with average
//		IntStream.range(0, 101).average().ifPresent(System.out::println);
		
		
		//Example of sorted, find first
//		Stream.of("Nishant", "Sushant", "Prashant", "Abhay", "Arun", "Akhil")
//		.sorted()
//		.findFirst()
//		.ifPresent(System.out::println);
		
//		Stream.of("Nishant", "Sushant", "Prashant", "Abhay", "Arun", "Akhil")
//		.filter(str-> str.startsWith("A"))
//		.sorted()
//		.forEach(System.out::println);
	
		//Stream to print squares of even numbers between 1 -100
		IntStream.range(0, 101)
		.filter(num -> num%2==0)
		.map(num -> num * num)
		.forEach(System.out::println);
	}
}

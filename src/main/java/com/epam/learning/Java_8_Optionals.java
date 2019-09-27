package com.epam.learning;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Java_8_Optionals {
	
	public static void main(String args[]) {
		Optional<String> opt1 = Optional.of("Optional_Test");
		optional_example(opt1);
		 
		Optional<String> opt2 = Optional.empty();
		optional_example(opt2);
		
		Optional<String> opt3 = (Optional.ofNullable(null));//if we use Optional.of(), it will throw Null Pointer Exception if passed argument is Null.
		optional_example(opt3);
		
		
	}
	
	public static void optional_example(Optional<String> opt) {
		System.out.println(opt.isPresent());
		//Java 11 onwards we can use .isEmpty to get reverse of above result
		
		opt.ifPresent((str)->{
			System.out.println(str.toUpperCase());
		});
		
		if(opt.isPresent()) {
			System.out.println(opt.map((str)->str.toLowerCase()).get());
			System.out.println(opt.filter((str)-> str.equals("Optional_Test")).get());
		}		
		
	}

}

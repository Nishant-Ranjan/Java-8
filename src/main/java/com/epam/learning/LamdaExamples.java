package com.epam.learning;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*Author: Nishant Ranjan
Date : 24th Sep, 2019*/

public class LamdaExamples {

	
	
	public static void main(String args[]) {
		testLambdaExpressionAndFunctionalInterfaces();
	}

	/* Examples of Lambda expressions and functional interfaces 
	 * Start*/


	public static void testLambdaExpressionAndFunctionalInterfaces() {

		/* Predicate Functional Interface */
		Predicate<Character> checkLowerCase = c ->  (c >96 && c < 123);
		System.out.println(checkLowerCase.test('a'));
		System.out.println(checkLowerCase.test('A'));
		
		/* Consumer Functional Interface */ 
		//Method references
		Consumer<String> changeToLowerCase  = (System.out::println);
		changeToLowerCase.accept("John");
		
		/* Function Functional Interface */
		Function<String,String> changeToUpperCase = (str) ->  str.toUpperCase();
		System.out.println(changeToUpperCase.apply("My Name is John Doe."));
		
		/* Supplier Functional Interface */
		Supplier<String> displayName = ()-> "John Doe";
		System.out.println("Name: "+displayName.get());
		
		//Custom Functional INterface
		SampleFunctionalInterface getAsciiValue = (ch) -> ((int)ch); 
		System.out.println(getAsciiValue.calculate('%'));
		

	}

}

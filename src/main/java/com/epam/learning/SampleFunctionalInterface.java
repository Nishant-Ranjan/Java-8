package com.epam.learning;

//The mentioned annotation marks it as an Functional Interace
//If we try to add any more abstract method it will throw complilation errors
@FunctionalInterface
public interface SampleFunctionalInterface {
	public abstract int calculate(char ch);
}

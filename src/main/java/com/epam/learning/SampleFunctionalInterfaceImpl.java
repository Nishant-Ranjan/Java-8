package com.epam.learning;

public class SampleFunctionalInterfaceImpl implements SampleFunctionalInterface {

	@Override
	public int calculate(char ch) {
		return (int)ch;
	}

	@Override
	public String concateNames(String firstName, String secondName) {
		return firstName.concat("-").concat(secondName);
	}

}

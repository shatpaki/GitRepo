package com.java.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find first Non-repeated element from a string.
public class findFirstNotRepeatedCharString {
	
	public static void main(String[] args) {
		
		String input = "i love Java Techie";
		//String input = "Sachin Suryakant Hatpaki";
		String[] results = input.split("");
//		System.out.println(Arrays.toString(results));
		
		String firstNonRepeatElement = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new, Collectors.counting()))
				.entrySet().stream()
				.filter(x -> x.getValue()==1)
				.findFirst().get().getKey();
		
		
		
		System.out.println("1st Non repeated character is: "+firstNonRepeatElement);
	}
	

}

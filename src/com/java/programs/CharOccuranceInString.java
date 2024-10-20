package com.java.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Occurence of each character in String
public class CharOccuranceInString {
	
	public static void main(String[] args) {
		
		String input = "i love Java Techie";
		String[] results = input.split("");
		System.out.println(Arrays.toString(results));
		
		
		Map<String,Long> map = Arrays.stream(results)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		//////// To exclude occurance of space.
		Map<String,Long> map1 = Arrays.stream(results).filter(a -> !a.contains(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map1);
	
		
	}
	

}

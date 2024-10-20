package com.java.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find all unique elements from a string.
public class findUniqueCharString {
	
	public static void main(String[] args) {
		
		String input = "i love Java Techie";
		String[] results = input.split("");
//		System.out.println(Arrays.toString(results));
		
		
		Map<String,Long> map = Arrays.stream(results)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(map);
		
		//////// To exclude occurance of space.
		Map<String,Long> map1 = Arrays.stream(results).filter(a -> !a.contains(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(map1);
		
		List<String> uniqueChars = map1.entrySet().stream()
				.filter(x -> x.getValue()==1)
				.map(Map.Entry :: getKey)
				.collect(Collectors.toList());
				
		System.out.println(uniqueChars);
	}
	

}

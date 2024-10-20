package com.java.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToIntegerList {
	
	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
		 
		List<Integer> listOfIntegers = listOfStrings.stream()
		        .map(Integer::valueOf)
		        .collect(Collectors.toList());
		 
		System.out.println(listOfIntegers);
	}
	
	/*
		 * List<String> scoresAsString = Arrays.asList("85", "92", "78", "90", "88");
	
	double averageScore = scoresAsString.stream()
	  .mapToInt(Integer::parseInt)	// Convert strings to integers using mapToInt()
	  .average()		// Calculate the average of the integers
	  .orElse(0.0);	// Use 0.0 if there are no scores
	
	System.out.println("Average score: " + averageScore);
	 */

}

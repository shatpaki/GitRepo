package com.java.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumberArray {
	
	public static void main(String[] args) {
		int[] numbers = {5,9,11,2,8,21,1};
		
		List<Integer> intList = Arrays.stream(numbers)
				.boxed()
//				.sorted()							//Sort in Ascending order
				.sorted(Comparator.reverseOrder())	//Sort in Descending order
				.collect(Collectors.toList());
		
		System.out.println("Desceding Sort: "+intList);
		
		Integer secondHighestNo = Arrays.stream(numbers)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(secondHighestNo);
				
				
				
				
		
		
	}

}

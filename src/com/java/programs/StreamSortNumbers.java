package com.java.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortNumbers {
	
	public static void main(String[] args) {
		int[] numbers = {5,9,11,2,8,21,1};
		
		List<Integer> intList = Arrays.stream(numbers)
				.boxed()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("Sorted: "+intList);
				
		
	}

}

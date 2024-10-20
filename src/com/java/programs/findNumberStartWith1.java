package com.java.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Find Elements from Array who starts with 1.
public class findNumberStartWith1 {

	public static void main(String[] args) {

		int[] numbers = {5,9,11,2,8,21,1,34, 56,19};
		
		List<String> strList = Arrays.stream(numbers)
				.boxed()
				.map(s->s+"")
				.filter(s->s.startsWith("1"))
				.collect(Collectors.toList());
		
		System.out.println(strList);

	}

}

package com.java.programs;

import java.util.Arrays;
import java.util.List;

public class javaStreamReduce {
	
	//Reduce() : Get a single value by performing operations on Stream elements.
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		System.out.println(intList.stream().reduce(0,(a,b) -> a+b));
		
	}
	
	
	
	




}

package com.java.programs;

import java.util.Arrays;
import java.util.List;

public class javaStream {
	
	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		//List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8);
		
		intList.stream().filter(a->a%2==0)	//Get Even numbers = 2,4
		.map(a->a+a)						//double even numbers = 4,8
		.filter(a->a>5)						//get numbers greater than 5 = 8
		.forEach(a -> System.out.println(a));
	}
}

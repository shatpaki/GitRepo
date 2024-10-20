package com.java.programs;

import java.util.Arrays;

// Find longest string from given array
public class LongestStringFromArray {
	
	public static void main(String[] args) {
		
		String[] strArray = {"Java", "Techie", "SpringBoot", "Micro Services", "Python", "C"};
		
		String longestString = Arrays.stream(strArray)
				.reduce((w1,w2)-> w1.length() > w2.length()? w1:w2)
				.get();
		
		System.out.println("Longest String: "+longestString);
		
	}

}

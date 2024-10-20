package com.java.programs;

import java.util.Arrays;
import java.util.List;

public class StringJoin {

	public static void main(String[] args) {
		
		List<String> nos = Arrays.asList("1","2","3","4");
		String joinedString = String.join("-", nos);
		System.out.println(joinedString);

	}

}

package com.java.programs;

import java.util.stream.IntStream;

public class SkipLimitExample {

	public static void main(String[] args) {
		
		IntStream.rangeClosed(1, 15)
		.skip(1)
		.limit(8)
		.forEach(System.out :: println);
		
		


	}

}

package com.java.programs;

public class factorialRecursive {
	
	public static void main(String[] args) {
		int n = 5;
		System.out.println("Factorial of "+n+" = "+factorial(5) );
	}
	
	public static long factorial(long n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}

}

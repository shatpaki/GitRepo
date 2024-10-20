package com.java.programs;

public class fibonacci {

	public static void main(String[] args) {
		
		int n = 5;
		int n1 = 0;
		int n2 = 1;

		int n3=0;
		
		for(int i=5; i>=0; i--)
		{
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		System.out.println("Fibonacci number for "+n+ " = "+n3);
	}

}

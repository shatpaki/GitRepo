package com.java;

public class Fibonacci {

	public static void main(String[] args) {
	
		int no = 7;
		
		int num1 = 0;
		int num2 = 1;
		int num3=0;
		System.out.print(num1 +" "+ num2 );
		
		for(int i=no; i> 0; i--)
		{
			num3 = num1+num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
	}

}

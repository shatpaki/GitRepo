package com.java.programs;

public class ReverseString {

public static void main(String[] args) {
		
		String str = "i love Java Techie";
		System.out.println("REVERSE OF STRING: "+ strRev(str));		
	}

private static String strRev(String str) {

	int strLen = str.length();
	char[] chars = str.toCharArray();
	StringBuilder sb = new StringBuilder();
	for(int i=strLen-1;i>=0;i--)
	{		
		char ch = chars[i];
		sb.append(ch);
	}
	return sb.toString();
}
}

package com.java.programs;

import java.util.Arrays;

//https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
public class AnagramChecker {
	
	public static void main(String[] args)
    {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        str1 = "gram";
        str2 = "arm";

        if (areAnagrams(str1, str2)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    public static boolean areAnagrams(String s1, String s2)
    {
        // Sort both strings
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted strings
        return Arrays.equals(charArray1, charArray2);
    }

    
}
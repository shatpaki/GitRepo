package com.java.programs;

import java.util.Arrays;

//https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/

//Time Complexity: O(m+n), where m and n is the length of given string
//Auxiliary Space: O(1)
public class AnagramCheckerIMP {
	
	public static void main(String[] args) {
        String s1 = "baacddeee";//"sadder";//"listen";
        String s2 = "eadbaecde";//"dreads";//"silent";
        System.out.println(isAnagram(s1, s2));
        
        s1= "Grab";
        s2= "Brag";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        System.out.println(isAnagram(s1, s2));
        
        
        s1 = "hello";
        s2 = "bello";
        System.out.println(isAnagram(s1, s2));
        
    }
    
    public static boolean isAnagram(String s1, String s2) {
        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // Create arrays to count frequency of each character (assuming lowercase English letters)
        int[] count = new int[26];
        
        // Count frequency of characters in string s1
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Subtract frequency of characters in string s2
        for (char c : s2.toCharArray()) {
            count[c - 'a']--;
        }
        
        // Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
    
}

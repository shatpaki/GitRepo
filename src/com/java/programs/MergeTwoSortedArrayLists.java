package com.java.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
Time Complexity : O(n1 + n2) 
Auxiliary Space : O(n1 + n2)
 */
public class MergeTwoSortedArrayLists {
	
	public static void main(String[] args) {
		
//		int[] a1 = new int[]{1,3,5};
//		int[] a2 = new int[]{2,4,6};
		
		int[] a1 = new int[]{98,23,54,12,67,3,89,34};
		int[] a2 = new int[]{56,21,34,1,99,22,67};
		
		
		/* Other Approach to create Arraylist and sort.
		ArrayList<Integer> list1 = 
	            new ArrayList<Integer>(Arrays.asList(5,10,20,12,34));
		
		ArrayList<Integer> list2 = 
	            new ArrayList<Integer>(Arrays.asList(90,34,67,23,89,99));
		Collections.sort(list1);  
		Collections.sort(list2);  
		*/
		
		
		List<Integer> list1 = Arrays.stream(a1)
				.boxed()
				.sorted()
//				.collect(Collectors.toList());	OR   //before JAVA 16 
				.toList();       					 //after JAVA 16
		System.out.println("List1: "+list1);
		
		List<Integer> list2 = Arrays.stream(a2)
				.boxed()
				.sorted()
				.toList();       					 
		System.out.println("List2: "+list2);
		
		List<Integer> list3 = new ArrayList<>();
		
		int i, j;
		for (i = 0, j = 0; i < list1.size() && j < list2.size();) {
		    if (list1.get(i) < list2.get(j)) {
		    	list3.add(list1.get(i));
		        i++;
		    } else {
		    	list3.add(list2.get(j));
		        j++;
		    }
		}

		while(i < list1.size()) list3.add(list1.get(i++));
		while(j < list2.size()) list3.add(list2.get(j++));
		
		System.out.println("SORTED 3RD LIST3 : "+list3);
		
	}
	

}

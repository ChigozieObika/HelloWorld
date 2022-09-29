package com.bptn.courseweek2;

public class LinearSearchMethod {

	public static void main(String[] args) {
		
		// Search #1
		int key = 15;
		int ind = 0;
		
		int [] a = {2, 8, 4, 2, 12, 6};
		
		ind = search(a, key);
		System.out.println("Index: " + ind);
		
		// Search #2
		key = 8;
		ind = 0;
				
		int [] b = {5, 4, 1, 13, 8, 9};
				
		ind = search(b, key);
		System.out.println("Index: " + ind);
		
		// Search #3
		String keyString = "purple";
		ind = 0;
						
		String [] c = {"red", "green", "purple", "blue"};
						
		ind = searchString(c, keyString);
		System.out.println("Index: " + ind);	

	}
	
	public static int search (int [] a, int key) {
		
		int ind = -1;
		
		for (int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				ind = i;
				break; // breaks out from the for loop
			}
		}
		return ind;
		
	}
	
	public static int searchString (String [] c, String key) {
		
		int ind = -1;
		
		for (int i = 0; i < c.length; i++) {
			if (key.equals(c[i])) {
				ind = i;
				break; // breaks out from the for loop
			}
		}
		return ind;
		
	}

}

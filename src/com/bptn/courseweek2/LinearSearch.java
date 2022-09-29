package com.bptn.courseweek2;

public class LinearSearch {

	public static void main(String[] args) {
		
		int key = 2, ind = -1;
		
		int [] a = {3, 8, 4, 2, 12, 6};
		
		for (int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				ind = i;
				break; // breaks out from the for loop
			}
		}
		
		System.out.println("Index: " + ind);

	}

}

package com.bptn.courseweek2;

import java.util.Arrays;

public class SelectionSortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In each iteration, it will get you the smallest element at first place of an array
		// The smallest element swaps positions with the element at the first position
		
		int [] arr = {5, 1, 25, -5, 16, 10, 15, 7};
		// first for loop
		
		int i = 0;
		
		while (i < arr.length - 1) {
			
			int minIndex = i; // store the index of the minimum value temporarily
			
			// second for loop
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) { // if the value at index j is smaller than the value at minIndex
					minIndex = j;
				}
			}
			
			// it's time to swap values
			int temp = arr[i]; // store the value at index j in a temp variable
			arr[i] = arr[minIndex]; // replace the value at index j with the minimum value
			arr[minIndex] = temp;
			
			i++;
			
		}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

	}

}

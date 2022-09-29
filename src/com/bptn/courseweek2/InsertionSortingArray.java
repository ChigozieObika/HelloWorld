package com.bptn.courseweek2;

import java.util.Arrays;

public class InsertionSortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {8, 4, 5, 9, 3};
		
		for (int j = 1; j < a.length; j++) {
			
			int temp = a[j];
			int possibleIndex = j;
			
			while (possibleIndex>0 && temp < a[possibleIndex - 1]) {
				a[possibleIndex] = a[possibleIndex - 1];
				possibleIndex--;
				System.out.println(Arrays.toString(a));
			}
			
			a[possibleIndex] = temp;
			System.out.println(Arrays.toString(a));
		}
		System.out.println("final array: ");
		System.out.println(Arrays.toString(a));

	}

}

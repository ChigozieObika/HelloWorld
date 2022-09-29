package com.bptn.courseweek1;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3, 4, 5, 6, 7};
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			
		for (int i : arr) {
			if (i != 4) {
				System.out.println(i);
			}
		}

	}

}

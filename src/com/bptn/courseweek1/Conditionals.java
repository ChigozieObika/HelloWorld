package com.bptn.courseweek1;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 3;
		int c = 6;
		if (a > b) {
			if (a < c) {
				System.out.println(a + " is smaller than " + c);
			} else {
				System.out.println(a + " is bigger than " + c);
			}
		} else if (a < b) {
			System.out.println(a + " is smaller than " + b);
		} else {
			System.out.println(a + " is equal to " + b);
		}
	}

}

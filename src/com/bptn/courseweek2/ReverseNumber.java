package com.bptn.courseweek2;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num = 1234;
		int reverse = 0;
		// String reverse = "";
		int remainder = 0;
		
		while (Num!= 0) {
			remainder = Num % 10; // Grab the last digit of the number
			reverse = (reverse * 10) + remainder; // Append the last digit to the reverse number
			// reverse = reverse + remainder;
			Num = Num/10; // Remove the last digit of the number
		}
		
		System.out.println("The reverse number is: " + reverse);

	}

}

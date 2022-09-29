package com.bptn.courseweek1;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); //Creates a scanner object so we can read info from the keyboard
//		
		System.out.println("Enter Username: ");
		
		String username = scan.nextLine(); //Reads a string from the console
		
		System.out.println("Hello " + username); //Display a Hello
//
		System.out.println("Enter your age: ");

		int age = scan.nextInt(); // Reads a string from the console
		
		if (age > 0) {
			System.out.println("Age is a positive number");
		}
		
		if (age < 0) {
			System.out.println("Age is a negative number");
		}

//		System.out.println("Age is " + age); // Display a Hello

	}

}

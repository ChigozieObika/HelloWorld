package com.bptn.courseweek3;

import java.io.BufferedReader;

public class ExceptionExample {
	
	void divide() {
		int a =5;
		int b = 0;
		int c = 0;
		
		// Arithmetic Exception - unchecked exception
		c = a/b;
		
		try { // Put risk code in try and catch block	
			c = a/b;
		} catch (Exception e) { // We put in the catch block what we will do if the exception happen.
			System.out.println("Dear valued user, the system is unavailable at this moment. Please try in 5 minutes. " + e.getMessage());
			e.printStackTrace();
			c = 0;
		}
		
		System.out.println(c);
	}
	
	void index() {
		int [] a = {1, 2, 3, 4};
		try {
			a[4] = 4;
			
		} catch (Exception e) {
			System.out.println("Dear valued user, the system is unavailable at this moment. Please try in 5 minutes. " + e.getMessage());
			// e.printStackTrace();
		}
	}
	
//	void processFile() {
//		BufferedReader file =null;
//		file = File.open("testfiile.txt")
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExample obj = new ExceptionExample();
		
		obj.index();

	}

}

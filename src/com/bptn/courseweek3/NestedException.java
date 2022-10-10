package com.bptn.courseweek3;

public class NestedException {

	public static void main(String[] args) {
		try {
			int b = 100;
			
			try {
				
				b = b/0;
				
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			
			int [] a  = new int[10];
			try {
				a[50] = 100;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			
			String str1 = null;
			try {
				int c = str1.length();
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			}
			
			String str2 = "abc";
			try {
				int i = Integer.parseInt(str2);
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

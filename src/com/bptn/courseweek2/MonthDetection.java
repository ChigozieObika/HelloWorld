package com.bptn.courseweek2;

import java.util.Scanner;

class Month {
	
	String printMonth(int month) {
		
		String str = "";
		
		switch (month) {
		case 0:
			str = "January";
			break;
		case 1:
			str = "February";
			break;
		case 2:
			str = "March";
			break;
		case 3:
			str = "April";
			break;
		case 4:
			str = "May";
			break;
		case 5:
			str = "June";
			break;
		case 6:
			str = "July";
			break;
		case 7:
			str = "August";
			break;
		case 8:
			str = "September";
			break;
		case 9:
			str = "October";
			break;
		case 10:
			str = "November";
			break;
		case 11:
			str = "December";
			break;
		default:
			str = "Invalid Month";
			break;
		}
		
		return str;
	}
}

public class MonthDetection {

	public static void main(String[] args) {
		// create an object of class Month
		Month obj = new Month();
		
		// create a scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the month number: ");
		int month = scan.nextInt();
		
		String str = obj.printMonth(month);
		
		System.out.println("The month is: " + str);
		
		scan.close();
	}

}

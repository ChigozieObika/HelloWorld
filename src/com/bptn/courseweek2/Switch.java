package com.bptn.courseweek2;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 4;
		String str = "";
		
		if (day == 0) {
			str = "Sunday";
		} else if (day == 1) {
			str = "Monday";
		} else if (day == 2) {
			str = "Tuesday";
		} else if (day == 3) {
			str = "Wednesday";
		} else if (day == 4) {
			str = "Thursday";
		} else if (day == 5) {
			str = "Friday";
		} else if (day == 6) {
			str = "Saturday";
		} else {
			str = "Invalid Day";
		}
		
		System.out.println(str);
		
		day = 5;
		
//		switch case is only used for equality, cannot be used for ranges of values
//		and other conditionals
		
		switch(day) {
		case 0:
			str = "Sunday";
			break;
		case 1:
			str = "Monday";
			break;
		case 2:
			str = "Tuesday";
			break;
		case 3:
			str = "Wednesday";
		case 4:
			str = "Thursday";
			break;
		case 5:
		case 6:
			str = "Weekend"; break;
		default:
			str = "Invalid Day";
		}
		System.out.println(str);
	}
}

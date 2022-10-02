package com.bptn.courseweek2;

import java.util.Scanner;

class Diamonds {
	void printDiamonds(int num)
	{
	    int  num1, num2;
	    
	    // outer loop to print the first half of the diamond
		for (num1 = 1; num1 <= num; num1++)
	      {
	        // prints the spaces required to form the shape 
			for (num2 = 1; num2 <= num - num1; num2++) {
				System.out.print(" ");
			}
	        
			// prints the stars for the shape
			for (num2 = 1; num2 <= num1*2-1; num2++) {
				System.out.print("*");
			}
			
			//ensuring the next iteration prints on the next line
			System.out.println("");
	      }
		for (num1 = num - 1; num1 > 0; num1--)
	      {
	        // prints the spaces required to form the shape 
			for (num2 = 1; num2 <= num - num1; num2++) {
				System.out.print(" ");
			}
	        
			// prints the stars for the shape
			for (num2 = 1; num2 <= num1*2-1; num2++) {
				System.out.print("*");
			}
			
			//ensuring the next iteration prints on the next line
			System.out.println("");
	      }
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		Diamonds obj = new Diamonds();
		
		obj.printDiamonds(num);
		scan.close();
	}

}

package com.bptn.courseweek2;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 4) {
				continue;
			}
			
			if (i == 7) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("After the loop");
		
		int i = 0;
		while (i < 10) {
			if (i == 4) {
			i++;
			continue;
		}	
		if (i == 7) {
			break;
		}
			
			System.out.println(i);
			i++;
		}
		
		for (int j = 0; j < 5; j++) {
			for (int k = 0; k < 4; k++) {
				if (k == 2) {
					break;
				}
				System.out.println("j: " + j + ", k:" + k);
			}
		}

	}

}

package com.bptn.courseweek4;

import java.util.Arrays;

class ThreadWithInterface implements Runnable {

		String name;

		public ThreadWithInterface(String name) {
			super();
			this.name = name;
		}
		
		
		@Override
		public void run() {
			
			System.out.println("Running: " + this.name);
			
			try {
	  		   for (int i=10; i>0; i--) {
				  System.out.println("Thread: " + this.name);
//				  Thread.sleep(100);
	  		   }
			} catch (Exception e) {
					e.printStackTrace();
			}

			System.out.println("Exiting: " + this.name);
		
		
	}
	
}

public class MyThreadInterfaceExample {

	public static void main(String[] args) {
		ThreadInterfaceExample obj = new ThreadInterfaceExample("T1");

	}

}

package com.bptn.courseweek3;

// Unchecked because the class extends RuntimeException class
class MyException extends RuntimeException{

	private static final long serialVersionUID = 3182887625788154208L;

	public MyException() {
		super();
		
	}

	public MyException(String message) {
		super(message);
		
	}
	
	
}

class MyException2 extends Exception{

	private static final long serialVersionUID = 3182887625788154208L;

	public MyException2() {
		super();
		
	}

	public MyException2(String message) {
		super(message);
		
	}
	
	
}



public class CustomException {

	public static void main(String[] args) {
		
		
		CustomException obj = new CustomException();
		try {
			obj.processSomething();
		} catch (MyException e) {
			System.out.println("Dear User, please try later!");
		}

	}
	
	void processSomething() {
		
		double value = 0; // Cannot be zero, if it is zero, it's because 
						  // something very bad has happened
		/*
		 * We have a very interesting business
		 */
		
		value = -100;
		
		if (value < 0) {
			throw new MyException("The calculated value was Negative");
		}
	}
	
void processSomething2() throws MyException2 {
		
		double value = 0; // Cannot be zero, if it is zero, it's because 
						  // something very bad has happened
		/*
		 * We have a very interesting business
		 */
		
		value = -100;
		
		if (value < 0) {
			throw new MyException("The calculated value was Negative");
		}
	}

}

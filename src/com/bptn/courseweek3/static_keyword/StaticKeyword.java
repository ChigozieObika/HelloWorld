package com.bptn.courseweek3.static_keyword;
		/*
		 * The static keyword indicates that the member (attributes and methods) belongs to the class
		 * and not to the object.
		 * In other words, we can use the member without creating the actual object.
		 * Static can only be applied only in attributes and methods.
		 */

class Employee {
	
	static final double PI = 3.14159; 
// In Java, we create constants using the keywords static and final simultaneously. Static means the
// variable is shared across all the objects of the class. Final means the variable cannot be modified
// once initialized. By convention, all Java constant names must be in upper-case letters.
	
	
	static int age; // This attribute is shared across all the objects of the class
	
	static int add2Numbers(int a, int b) {
		/*
		 * We cannot refer non-static members(attributes and methods) from static methods.
		 * We can only refer static members from static methods. We can refer the attribute age in this
		 * method. Note: A good indicator that a method can be static is when its execution depends 
		 * solely on their parameters (or static members)
		 */
		age = 4;
		return a + b;
	}
	
	/*
	 * static method ---> No access to non-static variables and non-static methods
	 * non-static methods ---> access to everything, including static methods and attributes.
	 * We can call static methods or access static attributes from non-static methods.
	 * But we need to create an object to run the non-static (normal) method
	 */
	int add3Numbers (int a, int b, int c) {
		int result = Employee.add2Numbers(a, b) + c;
		return result;
	}
}

// String hello = "Hello"

public class StaticKeyword {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.age = 20;
		
		Employee emp2 = new Employee();
		emp2.age = 30;
		
		System.out.println("Emp1 age " + emp1.age); 
// The static condition of the 'age' attribute means that every object of the Employee class will share
// the latest value of 'age' set by any Employee object.
		
		int a = Employee.add2Numbers(5, 4); // We can call the static method from the class because it
		System.out.println(a);				// belongs 
		
		int b = emp1.add2Numbers(7, 9);
		System.out.println(b);
		
		/*
		 * If we need to call a method from the main() method we have two options:
		 * 1. We can make the other method() static (simpler, but not always possible because we cannot
		 * 											call non-static attributes from the method)
		 * 2. Create an object of the class that contains the main() method, then call the non-static
		 * method using the object
		 */
		StaticKeyword obj = new StaticKeyword();
		obj.printOut(4);

	}
	
	void printOut(int a) {
		System.out.println("The input is: " + a);
	}

}

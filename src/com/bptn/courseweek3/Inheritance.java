package com.bptn.courseweek3;

class Person {
	
	// 1. Attributes
	int id;
	String firstName;
	String lastName;
	double salary;
	
	// If no constructor is specified, Java will create a default constructor (doesn't take parameters) for you.
	// See below
	// Person () {}
	// If you define a constructor, Java won't create the default constructor.
	
	
	// 2. COnstructors
	// Polymorphisom - Overloading
	Person (int id) {
		this.id = id;
	}
	
	
	Person(int id, String firstName, String lastName, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}


	// 3. Methods
	void display() {
		System.out.println("id: " + id);
		System.out.println("firstName " + firstName);
		System.out.println("lastName " + lastName);
		System.out.println("salary " + salary);
		System.out.println();
	}
}

class Employee extends Person {
	
	String position;

	Employee(int id, String firstName, String lastName, double salary, String position) {
		super(id, firstName, lastName, salary);
		this.position = position;
	}
	
	// Java Annotation - Informational Annotation
	// 1. Provides information that this method is overwritten to the software developer
	// 2. Java verifies that a method with the same signature exists in the parent class
	// Polymorphism - Override
	// 		1.	Overload - 	happens when in the same class we have two or more constructors
	//						or methods with the same name but different parameters
	//		2.	Overriding -	happens when in the child class we have a method with the same 
	//							signature as in the parent class.
	@Override
	void display() {
		super.display();
		System.out.println("position " + position);
		System.out.println();
	}

	@Override
	public String toString() {
		return "Employee [position=" + position + ", id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + "]";
	}
	
}

class Manager extends Person {
	
	Employee [] employees;

	Manager(int id, String firstName, String lastName, double salary, Employee [] employees) {
		super(id, firstName, lastName, salary);
		this.employees = employees;
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1000, "John", "Smith", 100000, "Director");
		emp1.display();
		
		Employee [] employees = new Employee[2000];
		
		Manager man1 = new Manager(1010, "Nick", "Johnson", 120000, employees);
		man1.display();
		
	}

}













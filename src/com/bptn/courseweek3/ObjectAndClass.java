package com.bptn.courseweek3;

// Java creates a constructor for a class without a declared constructor
class Student {
	
}

class EmployeeA {
	
	// Attributes (Fields, Properties, Instance Variables)
	int id;
	String name;
	double salary;
	String position;
	
	 /* 
	  * Constructor
	  * Constructor is a special method that is used to initialize object
	  * The constructor is called automatically when an object of the class is created
	  * 
	  * Constructor Rules:
	  * 1. The constructor name must be the same as the class name
	  * 2. Must not return a value
	 */
	EmployeeA() {
		id = 0;
		name ="";
		salary = 0.0;
		position = "";
		
		System.out.println("Inside the first constructor");
	}
	
	// parameterized constructor
	EmployeeA(int id, String name, double salary, String position) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.position = position;
		
		System.out.println("Inside the second constructor");
	}
	
	/*
	 * Methods
	 * A block of code that runs when it is called
	 */
	
	// Overloading polymorphism - two methods or constructors that take different parameters
	// Overloading can only be used in methods and constructors
	// return type method_name(parameters) 
	// default constructor
	double bonus(double percentage) {
		double tmp = (salary * percentage) / 100;
		return tmp;
	}
	
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(position);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	// used when there is a need to print out object variables
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", position=" + position + "]";
	}
	
}

public class ObjectAndClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeA obj1 = new EmployeeA();
		obj1.id = 1010;
		obj1.name = "Chigozie";
		obj1.salary = 80000;
		obj1.position = "Manager";
		
		obj1.display();
		
		EmployeeA obj2 = new EmployeeA();
		obj2.setId(2020);
		obj2.setName("Obika");
		obj2.setSalary(90000);
		obj2.position = "SDE";
		
		obj2.display();
		
		EmployeeA obj3 = new EmployeeA(3030, "Tobe", 100000, "SDE");
		
		
		obj3.display();
		
		Student stu = new Student();
		
		double bonus = obj3.bonus(10);
		System.out.println("The bonus is: " + bonus);
		
		// can only print out content with a toString() method from line 
		System.out.println(obj3);

	}

}

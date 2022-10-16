package com.bptn.courseweek4;

import com.bptn.course.week4.tuesday.MyClass;

/*
 * A Java interface is like a contract that must be accomplished by the class or classes that 
 * implement the interface. 
 * The purpose of an interface is to have abstract methods.
 * All my interface'smethods are public abstract by default
 */
interface MyInterfaceClass{
	
	int data = 0; // Attributes inn interfaces are always public, static and final; this means they are constants
	void doSomething();
	int add (int a, int b);
	void display();
	
	default void newDisplay() { // use the default keyword that allows addition of new methods that
		System.out.println("new display method");//could break other codes that depend on the production
	}
	
}

class MyClassClass implements MyInterfaceClass {
	
	String myAttribute;
	
	@Override
	public void doSomething() {
		System.out.println("Doing Something");
	}

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public void display() {
		System.out.println(this.myAttribute);
		
	}
}

public class MyInterfaceExample {

	public static void main(String[] args) {
		MyClassClass.newDisplay();

	}

}

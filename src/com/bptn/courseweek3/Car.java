package com.bptn.courseweek3;

public class Car {

	// instance variables (property: color)
	public String color;
	
	// Set color of a car
	public void setColor(String carColor) {
		color = carColor;
	}
	
	// Print color of a car
	public void getColor() {
		System.out.println("Color of the car is: " + color);
	}
	
	// main method for testing
	public static void main(String[] atgs) {
		Car destinyCar = new Car();
		destinyCar.setColor("Brown");
		destinyCar.getColor();
	}

}

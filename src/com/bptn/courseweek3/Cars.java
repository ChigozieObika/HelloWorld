package com.bptn.courseweek3;

public class Cars {
	
	// variables instances
	public String color; 
	
	public boolean ac, engine;
	
	//set color
	public void setColor(String carColor) {
		color = carColor;
	}
	
	// get color
	public void getColor() {
		System.out.println("Color of the car is: " + color);
	}
	
	// turn AC on
	public void turnAcOn() {
		ac = true;
	}
	
	// turn AC off
	public void turnAcOff() {
		ac = false;
	}
	
	// display ac status
	public void acStatus() {
	if (ac) {
		System.out.println("ac status: ON");
	} else 
		System.out.println("ac status: OFF");
	}
	
	// turn engine on
	public void turnEngineOn() {
		engine = true;
	}
		
	// turn engine off
	public void turnEngineOff() {
		engine = false;
	}
	
	// display engine status
	public void engineStatus() {
		if (engine) {
			System.out.println("Engine status: ON");
		} else 
			System.out.println("Engine status: OFF");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Team 4 car selection");
		System.out.println();
		
		Cars asterixCar = new Cars();
		asterixCar.setColor("Black");
		asterixCar.getColor();
		asterixCar.turnAcOn();
		asterixCar.acStatus();
		asterixCar.turnEngineOn();
		asterixCar.engineStatus();
		
		System.out.println();
		
		Cars karimCar = new Cars();
		karimCar.setColor("White");
		karimCar.getColor();
		karimCar.turnAcOff();
		karimCar.acStatus();
		karimCar.turnEngineOn();
		karimCar.engineStatus();
		
		System.out.println();
		
		Cars barryCar = new Cars();
		barryCar.setColor("Mauve");
		barryCar.getColor();
		barryCar.turnAcOff();
		barryCar.acStatus();
		barryCar.turnEngineOff();
		barryCar.engineStatus();
		
		System.out.println();
		
		Cars waleCar = new Cars();
		waleCar.setColor("Champagne");
		waleCar.getColor();
		waleCar.turnAcOff();
		waleCar.acStatus();
		waleCar.turnEngineOn();
		waleCar.engineStatus();
		
		System.out.println();
		
		Cars chigozieCar = new Cars();
		chigozieCar.setColor("Red");
		chigozieCar.getColor();
		chigozieCar.turnAcOff();
		chigozieCar.acStatus();
		chigozieCar.turnEngineOn();
		chigozieCar.engineStatus();

	}

}

package com.bptn.courseweek4;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	
	public static void main(String[] args) {
		
		// Make a collection
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    // We can loop over Java collections using an Iterator
	    // But the Foreach loop is preddered
	    for (String car: cars) {
	    	System.out.println(car);
	    }
	    
	    Iterator<String> iterator = cars.iterator(); 
	    while (iterator.hasNext()) { // Ask if there is a next element in the collect
	    	System.out.println(iterator.next()); // we get the value with the next method
	    }
	}

}

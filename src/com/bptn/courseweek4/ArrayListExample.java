package com.bptn.courseweek4;


import java.util.ArrayList;
import java.util.List;

class Person {
	String name;
	int age;
}

public class ArrayListExample {

	public static void main(String[] args) {

		// Create a list of Strings
		List<String> list = new ArrayList<>(); // create an arraylist

		list.add("John");
		list.add("Jane");
		list.add("Mike");
		list.add("Pete");

		// length of arraylist
		System.out.println("Size " + list.size());

		// return element at specified index
		System.out.println("The element at index = 2: " + list.get(2));

		// returns the index of the specified element in the array
		System.out.println("The index of Jane is: " + list.indexOf("Jane"));

		//Prints out all the elements of the list with for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//Prints out all the elements of the list with for-each
		for (String str: list) {
			System.out.println(str);
		}

		//Prints out all the elements of the list with foreach
		list.forEach(System.out::println);

	}

}


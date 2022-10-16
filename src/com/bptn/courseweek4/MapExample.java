package com.bptn.courseweek4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		
		// the goal of the map is to search by key and not by value
		// create a map (declare the map variable and allocate memory for the map)
		Map<Integer, String> map = new HashMap<>();
		
		// Add 3 entries to the map.
		// Map doesn't keep the insertion order
		// Linked
		map.put(1,  "John");
		map.put(2,  "Jane");
		map.put(3,  "Nick");
		
		System.out.println("The map size is: " + map.size());
		
		System.out.println("Key 2: " + map.get(2));
		System.out.println("Key 5: " + map.get(5));
		
		// If we put an existing key into the map, it will replace the old value with the new value
		map.put(2,  "Lily");
		System.out.println("Key 2: " + map.get(2));
		
		map.remove(3);
		
		if (!map.containsKey(2)) {
			map.put(2,  "Hello");
		}
		
		map.putIfAbsent(5,  "Hello");
		
		for (Entry<Integer, String> e: map.entrySet()) {
			System.out.println("k: " + e.getKey() + ", " + e.getValue());
		}
		
		map.forEach(a, b) --> System.out.println("Key: " + a + "Value: " + b);
		
	}

}

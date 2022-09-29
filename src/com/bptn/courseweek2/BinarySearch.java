package com.bptn.courseweek2;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int key = 12;
		int [] a = {2, 3, 5, 9, 12, 15};
		
		int ind = search (a, key);
		System.out.println("Index: " + ind);
		
		String str = "apple";
		String [] b = {"apple", "banana", "cherry", "dates"};
		
		int index = searchString (b, str);
		System.out.println("Index: " + index);

	}
	
	public static int search(int [] a, int key) {
		
		int left = 0;
		int right = a.length - 1;
		int middle = -1;
		
		while (left <= right) {
			middle = (left + right) / 2;
			if (key < a[middle]) {
				right = middle - 1;
			} else if (key > a[middle]) {
				left = middle + 1;
			} else if (key == a[middle]){
				return middle;
			}
		}
		
		return -1;
	}
	
	public static int searchString(String [] b, String key) {
		
		int left = 0;
		int right = b.length - 1;
		int middle = -1;
		
		while (left <= right) {
			middle = (left + right) / 2;
			if (key.compareTo(b[middle]) < 0) {
				right = middle - 1;
			} else if (key.compareTo(b[middle]) > 0) {
				left = middle + 1;
			} else if (key.compareTo(b[middle]) == 0) {
				return middle;
			}
		}
		
		return -1;
	}

}

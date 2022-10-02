package com.bptn.courseweek2;

import java.util.Arrays;


class RadixSort {
	
	// main driver method
	 public static void main(String[] args) {

		int [] inputArray = { 170, 45, 75, 90, 802, -1, -5, -9, 46, 423, 567, 24, 2, 66 };
		int n = inputArray.length;
				
		System.out.println("Before:");
		printArray(inputArray);
							
		radixsort(inputArray, n);
				
		System.out.println("After:");
		printArray(inputArray);
	}
	
	static void radixsort(int [] arr, int n) {
		
		// determine if array has a negative number
		boolean isNegative = false;
		for (int i : arr) {
			if (i < 0) {
				isNegative = true;
			}
		}
		
		int min = 0;
		if(isNegative) {
			min = Arrays.stream(arr).min().getAsInt();
			for (int i = 0; i < arr.length; i++) {
				arr[i] -= min;
			}
		}
		
		// get the max number of an array
		int maxNumOfArr = getMax(arr, n);
		
		for (int exp = 1; maxNumOfArr / exp > 0; exp *= 10) 
			countingSort(arr, n, exp);
		
		for (int i = 0; i < arr.length; i++) 
			arr[i] += min;
		
		
	}
	
	static void countingSort (int [] arr, int n, int exp) {
		
		int [] output =new int[n]; // output array
		int i;
		int countOfDigits[] = new int[10]; // array for count of digits
		
		// store count of occurrences in countOfDigits array
		for (i = 0; i < n; i++)
			countOfDigits[(arr[i] / exp) % 10]++;

		
		// replace elements of countOfDigits with the position of the elements in output array
		for (i = 1; i < 10; i++)
			countOfDigits[i] += countOfDigits[i - 1];
		
		// fill output array with actual elements of arr in an order
		for (i = n - 1; i >= 0; i--) {
			output[countOfDigits[(arr[i] / exp) % 10] - 1] = arr[i];
			countOfDigits[(arr[i] / exp) % 10]--;
		}
		
		for (i = 0; i < n; i++)
	        arr[i] = output[i];
		
	}
	
	static void printArray(int [] numbers) {
		for (int i =0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	static int getMax(int arr[], int n)
    {
        int maxNum = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > maxNum)
                maxNum = arr[i];
        return maxNum;
    }	

}

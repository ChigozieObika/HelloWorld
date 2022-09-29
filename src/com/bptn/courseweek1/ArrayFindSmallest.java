package com.bptn.courseweek1;

public class ArrayFindSmallest {
	
	public static int getIndexOfLastElementGreaterThanTarget(int[ ] values, int target)
	{
	      for (int index = values.length - 1; index >= 0; index--)
	      {
	         if (values[index] > target)
	             return index;
	      }
	      return -1;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] theArray = {-30, -5, 8, 23, 46};
	      System.out.println("Last index of element greater than 50: " + getIndexOfLastElementGreaterThanTarget(theArray, 50));

	}

}

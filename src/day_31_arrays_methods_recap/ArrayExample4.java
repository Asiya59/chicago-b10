package day_31_arrays_methods_recap;

import java.util.Arrays;

public class ArrayExample4 {
	
	public static void main(String [] args) {
		
		/*
		 * Create an array
		 * Sort
		 * Print out index numbers
		 */
		
		String [] groceryList = {"apple", "carrot","orange","cherry","strawberry"};
		
		Arrays.sort(groceryList);
		
		System.out.println("Index number of apple is: " + Arrays.binarySearch(groceryList, "apple"));
		System.out.println("Index number of orange is: " + Arrays.binarySearch(groceryList, "orange"));
		
	}

}

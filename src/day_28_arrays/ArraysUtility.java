package day_28_arrays;

import java.util.Arrays;

public class ArraysUtility {

	public static void main(String[] args) {
		String [] students = {"james", "john", "donald", "adam", "obama"};
		System.out.println(students);
		System.out.println(Arrays.toString(students));
		
		Arrays.sort(students);
		System.out.println(Arrays.toString(students));
		int i = Arrays.binarySearch(students, "john");
		System.out.println(i);
		int [] nums = {1,3,5,7,8};
		System.out.println(Arrays.binarySearch(nums, 4));
	}
	
}

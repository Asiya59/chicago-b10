package day_29_arrays_methods;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethods {
	
	public static void main(String[] args) {
//		int [] [] myNumbers = {{23,23,34,56,34}, {1,2,3,54}, {213,324,345,234}, {34,2}};
//		printDoubleArray(myNumbers);
		
//		int [] someRandomNumbers = {23,23,45,34,546,34,2};
//		myToString(someRandomNumbers);
		myTest(4,3,"James");
		nagivate("2700 S River rd", "Chicagoo, il");
	}
	
	public static void myTest(int a, int b, String name) {
		
	}
	
	public static void nagivate(String from, String destination) {
		// So much code that can take you from from address to destination address
	}
	
//	replicate the Arrays.toSTring() method and implement it
//	create a method that takes array and print out values in the format of -- [ele1, ele2, ele3, ]
	public static void myToString(int [] nums) {
		int [] someRandomNumbers = {23,23,45,34,546,34,2};
		String result = "[";
		for(int i = 0; i < nums.length; i++) {
			if(i == nums.length-1) {
				result += nums[i] + "]"; 
			}
			else {
				result += nums[i] + ", "; 
			}
		}
		System.out.println(result);
		
	}

	public static void sayHi(String name) {
		System.out.println("Welcome, " + name);
	}
	
//	 Create a method that prints out the two dimensional array values in the format of
//	[ele1, ele2, ele3, ele4,...]
//	[ele1, ele2, ele3, ele4,...]
//	[ele1, ele2, ele3, ele4,...]
	public static void printDoubleArray(int [][] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(Arrays.toString(numbers[i]));
		}
	}
	

	
}













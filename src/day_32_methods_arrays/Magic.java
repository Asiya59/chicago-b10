package day_32_methods_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Magic {
	
	public static void main(String[] args) {
		
//		myNumbers --> integer array
//		myNumbers[0] = 100;
//		myNumbers[1] = 100;
//		myNumbers[2] = 100;
		
		int[] arr = {23,2,3,5};
		int [] newArray = initialize(arr, 10);
		System.out.println("Printing from main method after catching");
		System.out.println(Arrays.toString(newArray));
		
	}
	
	public static void sayHello(String password) {
//		invisable stuff
		System.out.println("This is the value: " + password);
		
		if(password.equals("magic")) {
			System.out.println("Hello, World!!!");
		}
		else {
			System.out.println("password is invalid. Try again");
		}
	}
	
	public static int[] initialize(int [] nums, int target){
		System.out.println(Arrays.toString(nums));
		System.out.println("Target: " + target);
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = target;
		}
		System.out.println("After the loop:");
		System.out.println(Arrays.toString(nums));
		return nums;
	}
	
	

}










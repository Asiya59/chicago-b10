package day_28_arrays;

import java.util.Arrays;

public class ArrayValues {
	
	public static void main(String[] args) {
		String [] names = {"james", "john", "Adam"};
		int [] nums = {12,23,34,45};
		
		String myNames = Arrays.toString(nums);
		System.out.println(myNames);
		System.out.println(myNames.substring(2, 4));
	}

}

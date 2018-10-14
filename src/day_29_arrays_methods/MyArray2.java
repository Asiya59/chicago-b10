package day_29_arrays_methods;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    // 
	    boolean check = false;
	    for(int i = 0; i < nums.length-1; i++) {
	    		int first = nums[i];
	    		int second = nums[i+1];
	    		if(first == 5 && second == 5) {
	    			check = true;
	    			break;
	    		}
	    }
	    System.out.println(Arrays.toString(nums) + " --> " + check);
	    
	}
}

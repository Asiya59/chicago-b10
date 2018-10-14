package day_29_arrays_methods;

import java.util.Arrays;

public class MyTask {
	
//	Replace with 10 if number is not divisible by 10. 
//	If divisible by 10 then skip and change the value of replacement number to this value.
	
	public static void main(String[] args) {
		int [] nums = {12,23,34,10,3,50,3,0};
		int replacement = 10;
		System.out.println(Arrays.toString(nums));
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 10 != 0) {
				nums[i] = replacement;
			}
			else {
				replacement = nums[i];
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}

package day_29_arrays_methods;

import java.util.Arrays;
import java.util.Random;

public class MyTask2 {

	public static void main(String[] args) {
		Random random = new Random();
		
//		 Create two dimensional array with sizes of in picture
		int [] [] numbers = new int[4][];
		numbers[0] = new int[5];
		numbers[1] = new int[3];
		numbers[2] = new int[7];
		numbers[3] = new int[7];
		
		// assigning the values
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = random.nextInt(100);
			}
		}
		
		
		
		// to print the values
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(Arrays.toString(numbers[i]));
		}
		
//		Print values in the following format
//		[ ele1, ele2, ele3...]
//		[ ele1, ele2, ele3...]
//		[ ele1, ele2, ele3...]
//		[ ele1, ele2, ele3...]
//		Arrays.toString()
		
//		assigning a values to an arrays --> assign random integers
		String name = "james";
	}
	
	public static void sayHi() {
		
	}
}


















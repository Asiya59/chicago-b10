package day_32_methods_arr;

import java.util.Arrays;
import java.util.Random;

public class TopSecret {
	
	public static void main(String[] args) {
		
//		 I want to get 5 unique random number between 0-50;
		int [] i = getUniqueRandoms(5, 20);
		System.out.println(Arrays.toString(getUniqueRandoms(5, 20)));
		System.out.println(Arrays.toString(getUniqueRandoms(3, 10)));

		System.out.println(Arrays.toString(getUniqueRandoms(4, 20)));

		System.out.println(Arrays.toString(getUniqueRandoms(10, 40)));

		System.out.println(Arrays.toString(getUniqueRandoms(2, 10)));

	}
	
	
	public static boolean sendMessageToDT(String message) {
		
		// some coding that sends 'message' to 773-123-1234
		if(!message.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * This method returns unique random numbers for given size and given bound
	 * @param size
	 * @param bound
	 * @return integer array
	 */
	public static int[] getUniqueRandoms(int size, int bound) {
		int [] result = new int[size];
		Random random = new Random();
		boolean check = true;
		int index = 0;
		while(check) {
			int ranNum = random.nextInt(bound);
			if(!checkNumberInArray(result, ranNum)) {
				result[index] = ranNum;
				index++;
			}
//			[1,2,3,3,23]
			if(index == size) {
				check = false;
			}
		}
		return result;
	}
	
	public static boolean checkNumberInArray(int [] arr, int target) {
		for(int i: arr) {
			if(i == target) {
				return true;
			}
		}
		return false;
	}
	
}






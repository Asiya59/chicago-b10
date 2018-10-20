package day_32_methods_arr;

import java.util.Random;

public class ReturnMethod {

	public static void main(String[] args) {
		
//		method parameters, arguments
//		 We can declare as many parameters as we want in java custom method creation. 
//		Also we have option not to pass any parameter
//		A method that doesn't take any argument
		int i = getRandomBtwZeroToHundred();
		
	}
	
/**
 * This method returns random number between 0 to 100
 * Some more description
 * @return
 */
	public static int getRandomBtwZeroToHundred() {
		Random random = new Random();
		return random.nextInt(100);
	}
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	public static int getAge(String name) {
		if(name.equals("James")) {
			return 34;
		}
		else {
			return 55;
		}
		
	}
}

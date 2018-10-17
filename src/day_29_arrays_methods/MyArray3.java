package day_29_arrays_methods;

import java.util.Scanner;

public class MyArray3 {


	public static void main(String[] args) {
		// Palindrom
		
		String word = "aataa";
		 System.out.println("Is this palindrom: "+isPalindrom(word));
		 // find the second highest number from the array
		 int [] array = {2, 4, 34, 5, 3 };
		 word.length();
		 
		 int number = sumofTwoInteger(5, 6);
		 
		 
		System.out.println("The max value: "+Integer.MAX_VALUE);
		System.out.println("the second highest number is: "+findSecondValue(array));
		
	}
	public static int findSecondValue(int[] array) {
		
		if(array.length<3) {
			System.out.println("Please enter longer array!");
		}
		return 0;
	}
	// create function take string as parameter and retrun is palindrom or not : boolean
	
	public static boolean isPalindrom(String word) {
		
		// what is there a 10000000 
		// reverse is and compare 
		for(int i=0; i<word.length()/2; i++) {
			String character1 = word.charAt(i)+"";
			String characeter2 = word.charAt(word.length()-1-i)+"";
			if(!character1.equals(characeter2)) {
				return false;
			}
		}
		return true;
	}
	
	public static void hi () {
		int a=2;
		int  b=5;
		System.out.println("Sum is:" +a+b);
	}
	
	public static int  sumofTwoInteger(int a, int b) {
		 return a+b;
	}
}

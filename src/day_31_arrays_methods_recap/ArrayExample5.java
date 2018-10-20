package day_31_arrays_methods_recap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {
		// DivideMyArray app
		
		System.out.println("Welcome to DivideMyArray App!");
		
		System.out.println("Enter a number that will be the size of your array.");
		
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		int [] numbers = new int [size];
		
		for(int i=0; i<size; i++ ) {
			
			 numbers[i] = scan.nextInt();
			
		}
		
		System.out.println("The string value of your array: " + Arrays.toString(numbers));
		
		int [] firstHalf = Arrays.copyOfRange(numbers, 0, numbers.length/2);
		int [] secondHalf = Arrays.copyOfRange(numbers, numbers.length/2, numbers.length);
		System.out.println("The first half of your array is: " + Arrays.toString(firstHalf));
		System.out.println("The second half of your array is:" +Arrays.toString(secondHalf));
		
		
	}

}

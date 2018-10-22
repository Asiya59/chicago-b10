package day_32_methods_arrays;

import java.util.Arrays;

public class Miracle {

	public static void main(String[] args) {
//		char [] mm = getChars("Obama");
//		System.out.println(Arrays.toString(mm));
		int [] nums = {12,34,45,56};
		printElements(1,2,3,5,34,456,1);
	}
//	Create an char array with the size of letters
//	loop through each letters and assign to each position of newly created char array
//	return the created char array
	public static char[] getChars(String word) {
		int size = word.length();
		char [] myChars = new char[size];
		for(int i = 0; i < size; i++) {
			myChars[i] = word.charAt(i);
		}
		System.out.println(Arrays.toString(myChars));
		return myChars;
	}
	
	public static void printWordsWithSize(String [] words, int size) {
		for(String word: words) {
			if(word.length() == size) {
				System.out.println(word);
				}
			}	
		}
//	Var args
	public static void printElements(int... nums) {
		for(int n: nums) {
			System.out.println(n);
		}
	}
	
}












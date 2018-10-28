package day_35_methods_recap;

import java.util.Arrays;
import java.util.Scanner;

public class Practice01_CountWords {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence to be analyzed: ");
		
		String sentence = scan.nextLine();
		countWords(sentence);
	}
	
	public static void countWords(String str) {
		
		String [] splitStr = str.split(" ");
		String splitArr = Arrays.toString(splitStr);
		
		System.out.println("The values of the split string is as followed: " 
		+ splitArr);
		
		System.out.println("The number of words in this sentence: " + splitStr.length);
		
	}

}

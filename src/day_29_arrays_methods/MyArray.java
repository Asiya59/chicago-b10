package day_29_arrays_methods;

import java.util.Scanner;

public class MyArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	    
//	    // print out first and last char of each word
	    for(String s: words) {
	    		System.out.println(s.charAt(0)+"" + s.charAt(s.length()-1));
	    		
	    }
	    
	    
	}
}

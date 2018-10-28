package day_36_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTask {
	
	public static void main(String[] args) {
		// Ask from user names 5 times and store them into list
		Scanner scan = new Scanner(System.in);
		List<String> names = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			System.out.println("Please enter name " + (i+1) + ": ");
			names.add(scan.nextLine());
		}
		System.out.println(names);
		names.remove(0);
//		boolean check = names.remove(0);
		System.out.println(names);
//		System.out.println(check);
		
	}

}









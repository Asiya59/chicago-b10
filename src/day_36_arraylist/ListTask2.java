package day_36_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTask2 {
	
	public static void main(String[] args) {
//		Ask user to enter name and store to the list of names until user
//		doesn't want to continue adding names. 
		boolean check = true;
		List<String> names = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		while(check) {
			System.out.println("Please enter name: ");
			names.add(scan.nextLine());
			System.out.println("Do you want to continue adding name? Yes/No");
			String answer = scan.next();
			scan.nextLine();
			if(answer.equalsIgnoreCase("no")) {
				check = false;
			}
		}
		System.out.println(names);
	}

}














package day_30_methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment {
	
	public static void main(String[] args) throws FileNotFoundException { 
		
		File file = new File("test.txt");
		Scanner sc=new Scanner(file); 
		while(sc.hasNextLine()){
			String name = sc.nextLine().trim();
			System.out.println(name);
			// variable name gives each name from the test.txt file
			} 
	}
	
	public static void generateNewGroup(String [] students, int groupSize) {
		
	}

}

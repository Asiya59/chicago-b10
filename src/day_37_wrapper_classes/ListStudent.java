package day_37_wrapper_classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListStudent {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("test.txt");
		
		List<String> studentNames= new ArrayList<>();
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String name = sc.nextLine().trim();
			if(name.isEmpty()) {
				continue;
			}
			studentNames.add(name);
		}
//		System.out.println(studentNames);
		System.out.println(studentNames.size());
		printStudents(studentNames);
		System.out.println("\n----\n");
		printWithLength(studentNames, 5);
		printWithLength(studentNames, 7);
		System.out.println("\n----\n");
		printFromShortToLongest(studentNames);

	}
	
	public static void printWithLength(List<String> students, int length) {
		int count = 0;
		for(String name: students) {
//			condition to check name length to given length
			if(name.length() == length) {
				System.out.println(name);
				count++;
			}
		}
//		System.out.println("Total size of names with " + length+ " length: " + count);
	}
	
	public static void printFromShortToLongest(List<String> students) {
		for(int i = 3; i < 16; i++) {
			printWithLength(students, i);
		}
	}
	
	public static void printStudents(List<String> students) {
//		Iterate through the list
		int num = 4;
		for(int i = 0; i < students.size(); i++) {
			if(i == num) {
				System.out.print(students.get(i));
				System.out.println();
				num+=5;
			}
			else {
				System.out.print(students.get(i) + " - ");
			}
			
		}
//		keep printing in one line with dash separated
//		apply condition to check is already printed 5 student names
//		when we hit condition we start new line
	}
}












package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ninja {
	
	public static void main(String[] args) {
		
			try {
				fly();
				System.out.println("After fly statements");
				System.exit(0);
			} catch (FileNotFoundException e) {
				System.out.println("this file is not found");
				System.exit(0);
			}
			finally {
				System.out.println("This is finally block. And this get executed no matter what happens to exception");
			}
		
		
		System.out.println("End of program");
	}
	
	public static void fly() throws FileNotFoundException {
		File file = new File("/Users/cybertekchicago-1/Desktop/tst.txt");
		Scanner sc = new Scanner(file);
		
	}

}

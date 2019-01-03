package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Internet {
	
	public static void main(String[] args)  {
		String name = "James";
		File file = new File("/Users/cybertekchicago-1/Desktop/test.txt");
		
		try {
			Scanner sc = new Scanner(file);
			System.out.println("After scanner load");
			System.out.println(name.charAt(23));
		}
		catch(FileNotFoundException | StringIndexOutOfBoundsException var) {
			// statements
			System.out.println("Hey your file was not found");
			try {
				System.out.println(name.charAt(45));

			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("Inner handling");
			}
//			var.printStackTrace();
		}
		
		System.out.println(name);
	}

}

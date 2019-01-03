package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.omg.CORBA.ExceptionList;

public class Plane {
	
	public static void main(String[] args){
		System.out.println("Program starting");
		File file = new File("/Users/cybertekchicago-1/Desktop/test.txt");
		
		try {
			Scanner sc = new Scanner(file);
			System.out.println("After scanner laod");
			Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println("General exception here");
			e.printStackTrace();
		}
		
		
		
		System.out.println("End of PRogram");
		
	}
	
	public static void test() throws Exception{
		File file = new File("/Users/cybertekchicago-1/Desktop/test.txt");
		
		
			Scanner sc = new Scanner(file);
			System.out.println("After scanner laod");
			Thread.sleep(2000);
		
	}

}

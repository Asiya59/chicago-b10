package exceptions;

import javax.management.RuntimeErrorException;

public class Explicit {
	
	public static void main(String[] args) throws Exception {
		try {
			doubleTheNumber(-23);
		}
		catch(RuntimeException e) {
			System.out.println("Not allowed input");
		}
		doubleTheNumber(-23);
		checked("jamie");
		
//		doubleTheNumber(3);
//		doubleTheNumber(2323);

	}
	
	public static void doubleTheNumber(int i) {
		if(i < 0) {
//			System.err.println("Enter ");
			throw new RuntimeException("Enter positive number");
		}else {
			System.out.println(i*2);
		}
	}
	
	public static void checked(String name) throws Exception{
		if(name.equals("james")) {
			throw new Exception("Checked exception here");
		}
		System.out.println("Welcome, " + name);
	}
	
	

}

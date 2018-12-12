package day_46_inheritance;

import java.util.Scanner;

public class Cat {

	static String name;
	int age;
	static boolean catDisease;
	
	public Cat(){
		System.out.println("Constructor for CAT");
	}
	
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name?");
		String name = scan.nextLine();
		
		if(name.equals("james")) {
			name = "Chilli";
		}else {
			this.name = "jojo";
		}
		
		age = 1;
	}
	
	static {
		System.out.println("Hey guys from Static block");
		catDisease = false;
	}
	static {
		System.out.println("static block second");
	}
	
}







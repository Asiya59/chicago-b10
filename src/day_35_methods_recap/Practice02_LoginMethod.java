package day_35_methods_recap;

import java.util.Scanner;

public class Practice02_LoginMethod {

	public static void main(String[] args) {

		login("johnJava","123456");
		
	}
	
	public static void login(String expectedId, String expectedPassword ) {
		
		System.out.println("You have pressed login button.");
		System.out.println("Please enter username:" );
		
		Scanner scan = new Scanner(System.in);
		String givenId = scan.nextLine();
		
		System.out.println("Please enter password: ");
		String givenPassword = scan.nextLine();
		
		
		if(expectedId.equals(givenId) && expectedPassword.equals(givenPassword)) {
			System.out.println("Login Successful!");
		}else {
			System.out.println("Either the password or the account");
		}
		
		
		
		
		
	}

}

package day53_OOP_Summary;

import java.util.Scanner;

public class Family {
	
	String mansionName;
	String carName;
	
	public void spendDaily(int i) {
		
		if( i> 50_000_000) {
			System.out.println(" Sir, you are spending " + i + " dollars."
					+ " Are you sure");
			Scanner scan = new Scanner(System.in);
			String answer = scan.nextLine();
			if(answer.equalsIgnoreCase("yes")) {
				System.out.println("Please enter password");
				String password = scan.nextLine();
				
				if(password.equals("password")) {
					System.out.println("Purchase granted. Have a nice day!");
				}else {
					System.out.println("Your banker will contact you in a minute!");
				
				}
			}else {
				System.out.println("Your banker will contact you in a minute!");
			}
			
			
		}else {
			System.out.println("Purchase granted. Have a nice day!");
		}
		
		
	}

}

package day_54_exceptions;

public class Campus {
	
	public static void main(String[] args) {
		String s = "James";
		
		try {
			Thread.sleep(2000);
			System.out.println(s.charAt(2));
		}
		
		catch(Exception e) {
			System.out.println("Some interruption happened here");
		}
		finally {
			System.out.println("This is finally block");
		}
		
		System.out.println("End of program");
		
	}

}

package exceptions;

public class Engineers {
	
	public static void main(String[] args) {
		int [] ages = {23,26,43,12,102};
		try{
			System.out.println(ages[6]);
		}
		finally {
			System.out.println();
		}
		System.out.println("End of program");
	}

}

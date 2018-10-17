package day_30_methods;

public class Calculator {
	
	public static void main(String[] args) {
		String name = "James";
		
		name.charAt(name.length()-1);
		
		int k = add(43,23);
		System.out.println("Just to make sure: " + k);
		multiply(45,23);
		
	}
	
	

	private static int multiply(int i, int j) {
		return i*j;
	}

	public static int add(int i, int j) {
		int sum = i + j;
//		System.out.println("Sum is: " + sum);
		return sum;
	}

}

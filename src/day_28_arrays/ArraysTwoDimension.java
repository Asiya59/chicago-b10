package day_28_arrays;

public class ArraysTwoDimension {

	public static void main(String[] args) {
//		What arrays can take?
		int [] [] numbers = new int[3][];
		
		int [] ages = {26,25,50,100};
		
//		numbers[0] = new int[4];
		numbers[0] = ages;
		System.out.println(numbers[0][2]);
		
		String [] schools = new String[10];
	}
}

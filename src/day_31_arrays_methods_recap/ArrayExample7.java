package day_31_arrays_methods_recap;

public class ArrayExample7 {

	public static void main(String[] args) {
		
		int [][] numbers = {		{1,2,3,4,5},
											{5,6,7},
											{4,3,2,1,6},
											{4,3,1,3}
										};
		
		for(int row=0; row<numbers.length; row++) {
			
			for(int col=0; col<numbers[row].length; col++) {
				
				System.out.print(numbers[row][col] + "\t");
				
			}
			
			System.out.println();
			
		}
		
	}

}

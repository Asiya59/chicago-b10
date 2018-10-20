package day_31_arrays_methods_recap;

public class ArrayExample8 {

	public static void main(String [] args) {
		
		int [][] numbers = {		{1,2,3,4,5},
											{5,6,7,8,9},
											{4,3,2,1,6},
											{4,3,1,3,5}
										};
		getCoord(numbers, 3, 4);	

	}
	
	public static void getCoord(int [][] givenArray, int rows, int cols) {
		 
			
		System.out.println("The element at the row number: " + rows + 
				" column number: "  + cols + " number itself : "+ givenArray[rows][cols]);
		
		
		
		
		
		
	}

}

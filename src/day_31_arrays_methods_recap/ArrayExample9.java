package day_31_arrays_methods_recap;

public class ArrayExample9 {

	public static void main(String[] args) {
		
		int [][] numbers1 = {	{1,2,3,4,5},{5,6,7,8,9},{4,3,2,1,6},{4,3,1,3,5} };
		int [][] numbers2 = {	{12,41,43,43},{45,41,27},{25,33,12,51,17},{23,53,21,73,18} };
		
		System.out.println("This is the first array given");
		printArrays(numbers1);
		
		
		System.out.println("This is the second array given");
		printArrays(numbers2);
	}
	
	public static void printArrays( int [][] givenArray) {
		
			for(int row=0; row<givenArray.length; row++) {
			
				for(int col=0; col<givenArray[row].length; col++) {
				
					System.out.print(givenArray[row][col] + "\t");
				
				}
			
			System.out.println();
			
		}
	}

}

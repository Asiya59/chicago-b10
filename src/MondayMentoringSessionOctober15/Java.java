package MondayMentoringSessionOctober15;

import java.util.Arrays;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		System.out.println(array(array, 6));
		
	}
	public static int array(int[] array , int number) {
		for(int i=0; i<array.length; i++) {
			if(array[i]==number) {
				return i;
			}
		}
		return -1;
	}
	public static int[] combineTwoArray(int[] array1, int[] array2) {
//		// two size is same;
		int idex =0;
		int[] array3 = new int[array1.length+array2.length];
		
		int []ar1= {1,2,3,4,5,6};
		int []ar2 = {7,8,9,10,};
		int []ar = new int[ar1.length+ar2.length];
		int z =0;
		for(int f :ar1) 
			ar[z++]=f;
		for(int f :ar2) 
			ar[z++]=f;
		//System.out.println(Arrays.toString(ar));
		return null;
		
	}

	
	
	
	
	
	
	
	
}

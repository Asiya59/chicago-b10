package day_45_inheritance;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int [] arr = {};
		int[] newArr = zerosToRight(arr);
		System.out.println(Arrays.toString(newArr));
	}
	
	public static int[] zerosToRight(int[] ar){
		if(ar.length == 0) {
			System.out.println("Empy arrays is not allowed");
			return null;
		}
		int[] arr = new int[ar.length];
		int j=0;
		for(int i=0; i<ar.length; i++){
		if(ar[i]!=0){
		arr[j]=ar[i];
		j++;
		}
		}

		return arr;
	}
}

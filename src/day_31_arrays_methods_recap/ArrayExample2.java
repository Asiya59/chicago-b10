package day_31_arrays_methods_recap;

import java.util.Arrays;

public class ArrayExample2 {

	public static void main(String[] args) {
		
		String [] shows = {"Game of Thrones","Prison Break","Doctor Who","Greys Anatomy","Friends"};
		
		Arrays.sort(shows);
		System.out.println("Sorted list of shows");
		for(int i=0; i<shows.length; i++) {
			
			System.out.println("#" + i + " "+ shows[i]);
		}
	}

}

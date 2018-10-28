package day_36_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		
//		Convert array to arraylist
		String [] oldNames = {"Trump", "Obama"};
		List<String> newNames = Arrays.asList(oldNames);
		System.out.println(newNames);
		String s = newNames.get(1);
		
//		newNames.add("new name");
		System.out.println(newNames);
		
//		List<String> names = new ArrayList<>();
//		names.add("James");
//		names.add("Adam");
//		names.addAll(newNames);
//		System.out.println(names);
//		
//		Collections.sort(names, Collections.reverseOrder());
//		System.out.println(names);
		
	}

}









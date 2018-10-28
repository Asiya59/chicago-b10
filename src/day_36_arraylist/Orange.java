package day_36_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Orange {

	public static void main(String[] args) {
		List<String> oldNames = new ArrayList<>();
		oldNames.add("Jason");
		oldNames.add("Adam");
		
		List<String> names = new ArrayList<>();
		names.add("James");
		names.add("john");
		System.out.println(names);
		add(names, "Trump", "Elize", "Esen", "Obama", "Bond");
		System.out.println(names);
		names.addAll(oldNames);
		System.out.println(names);
	}
	
	public static void add(List<String> list, String ... elements){
		for(String str: elements) {
			list.add(str);
		}
	}
	
}














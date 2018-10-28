package day_36_arraylist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Apple {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		System.out.println("Size before adding elements: " + names.size());
		names.add("James");
		names.add("John");
		names.add("Trump");
		names.add(3, "Obama");
		
		System.out.println("Size after adding names: " + names.size());
		System.out.println(names);
		
		String myName = names.get(2);
		System.out.println(names.indexOf("John"));
		System.out.println(myName);
		int [] ages = {23,34,45};
//		m(23,12,34,5,2,5,2);
	}
	
	public static void m(String ... names) {
		for(String i: names) {
			
		}
//		System.out.println(Arrays.toString(nums));
	}

}

//    public static List<String> add(

//     add(list,"james", "john", "obama", .....);
//    Create a custom method that accepts List of String, and accepts
//    String varags and adds all the given strings to the list and return
//	  the list. 












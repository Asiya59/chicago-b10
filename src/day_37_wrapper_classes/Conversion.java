package day_37_wrapper_classes;

import java.util.ArrayList;
import java.util.List;

public class Conversion {
	
	public static void main(String[] args) {
		// Autoboxing and Unboxing
//		If int gets converted to Integer type then it's called autoboxing
//		Autoboxing- automatically converting from primitive to Object type
//		Autoboxing happens implicitly
		int age = 56;
		
		Integer age2 = age;
		boolean raining = false;
		Boolean raining2 = raining;
		int i = 10;
		List<Integer> ages = new ArrayList<>();
		ages.add(34);
		
//		valueOf --> gets value of certain data type
		String amount = "transaction amount is 34545.3";
		String[] words = amount.split(" ");
		double d = Double.valueOf(words[words.length -1]);
		System.out.println(d);
//		s = s.replaceAll("\\D+","");
//		System.out.println(s);
//		If Integer gets converted to int type then it's Unboxing
//		When Object type gets converted into primitive type it's called
//		UNBOXING
		Character c= 'd';
		char cc = c;
	}

}






















package exceptions;

import java.util.List;

public class A {

	static List<String> names;
	
	public static void main(String[] args)  {
		
		try {
			System.out.println(names.get(0));
		}
		catch(NullPointerException e) {
			System.out.println("names is not instantiated");
		}
		
	}
}

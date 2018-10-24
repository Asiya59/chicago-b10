package day_34_method_overloading;

public class Survival {
	
	public static void hi(String name) {
		System.out.println("Hi, " + name);
	}
	
	public static void hi(int name) {
		System.out.println("Hi, " + name);
	}
	
	
	public static void hi(String name, String name2) {
		System.out.println("Hi, " + name);
		System.out.println("Hi, " + name2);
	}
	
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	
}

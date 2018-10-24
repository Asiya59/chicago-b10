package day_34_method_overloading;

public class Calculator {

	public static void main(String[] args) {
		byte b = 32;
		char a = 'A';
		add(a);
//		add(32L, 23);
	}
	
	public static void add(int i, int l) {
		System.out.println("long, int");
	}
	
	public static void add(int i, String l) {
		System.out.println("long, int");
	}
	
	public static void add(int s) {
		System.out.println("Int: " + s);
	}
	
	public static void add(double d) {
		System.out.println("Double: " +d);
	}
	
//	public static void add(long l) {
//		System.out.println("long: " + l);
//	}
//	
//	public static void add(int i) {
//		System.out.println("Int: " + i);
//	}
}

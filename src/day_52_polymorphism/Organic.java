package day_52_polymorphism;

public interface Organic {
	
	public static void play() {
		
	}
	public abstract void eat();
	
	default void organicMethod() {
		System.out.println("Organic method in Organic Interface");
	}
}

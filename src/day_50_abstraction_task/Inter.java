package day_50_abstraction_task;

public abstract interface Inter {
	
//	only constant field, abstract methods ,default methods , Static methods
	
	
	public abstract void play();
	
	public static void staticMethod() {
		System.out.println("This is some method with body in interface");
	}
	
	public default void defaultMethod() {
		System.out.println("this is some default method in interface");
	}
}

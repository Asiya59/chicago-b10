package day_52_polymorphism;

public class Apple extends Fruit implements Organic{
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating an apple in Apple class");
	}
	
	public void appleMethod() {
		System.out.println("Apple method in Apple class");
	}
	
	@Override
	public void fruitMethod() {
		System.out.println("Fruit method overriden in Apple class");
	}
}

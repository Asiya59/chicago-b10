package day_48_overriding;

public class Car {
	
	String model;
	int year;
	boolean sportEdition;
	
	public void seeDetails() {
		System.out.println(this);
		System.out.println(this.year);
		System.out.println(this.sportEdition);
	}
	
	public void seeDetails(Car c) {
		System.out.println(this);
//		System.out.println(c.year);
//		System.out.println(c.sportEdition);
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.model = "Toyota Camry";
		c1.year = 2018;
		c1.sportEdition = false;
		Car c2 = new Car();
		c2.model = "Honda Civic";
		c2.year = 2019;
		c2.sportEdition = true;
		c1.seeDetails(c1);
	}

}











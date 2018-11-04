package day_41_constructors;

public class TopGear {

	public static void main(String[] args) {
		Car c = new Car();
		c.make = "Lexus";
		c.sportEdition = false;
		c.mileage = 1000;
		c.year = 2018;
		System.out.println(c.mileage);
		c.drive();
		System.out.println(c.mileage);
		c.drive(200);
		System.out.println(c.mileage);
		
	}
}












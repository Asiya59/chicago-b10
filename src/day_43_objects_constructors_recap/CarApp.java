package day_43_objects_constructors_recap;

public class CarApp {
	
	public static void main(String [] args) {
		
		
		Vehicle hatchback = new Vehicle();
		hatchback.brand = "Ford";
		hatchback.miles = 12453;
		hatchback.model = "Focus";
		hatchback.price = 10000;
		hatchback.year = 2014;
		
		Vehicle suv = new Vehicle();
		suv.brand = "Porsche";
		suv.miles = 2000;
		suv.model = "Cayenne";
		suv.price = 55000;
		suv.year = 2017;
		
		Vehicle sedan = new Vehicle();
		sedan.brand = "toyota";
		sedan.miles = 50005;
		sedan.model= "camry";
		sedan.price = 12000;
		sedan.year = 2015;
		
		Vehicle truck = new Vehicle();
		truck.brand = "Ford";
		truck.miles = 20000;
		truck.model = "F150";
		truck.price = 25000;
		truck.year = 2016;
		
		
		System.out.println("All Vehicles In the Lot");
		
		Vehicle [] vehicleArr = {hatchback, suv, sedan, truck};
		for(int i=0; i<vehicleArr.length; i++) {
			
			System.out.println("---------------");
			System.out.println("Brand: " + vehicleArr[i].brand);
			System.out.println("Miles: " + vehicleArr[i].miles);
			System.out.println("Model: " + vehicleArr[i].model);
			System.out.println("Price: " + vehicleArr[i].price);
			System.out.println("Year: " + vehicleArr[i].price);
			
			
		}
		
		
	}

}

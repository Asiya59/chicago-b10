package day_42_encapsulation_static;

public class Store {

	public static void main(String[] args) {
		
//		Apple a = new Apple();
//		a.setColor("whatever");
//		a.size = -23;
//		System.out.println(a.getColor());
//		System.out.println(a.size);
		Human h1 = new Human();
		h1.setAge(100);
		System.out.println(h1.getAge());
		Human h2 = new Human();
		System.out.println(h1.todaysDate);
		h1.todaysDate = "November, 6 2018";
		System.out.println(h2.todaysDate);
		System.out.println(Human.todaysDate);
		Human.todaysDate = "Nov 8, 2019";
		System.out.println(h1.todaysDate);
	}
		
}















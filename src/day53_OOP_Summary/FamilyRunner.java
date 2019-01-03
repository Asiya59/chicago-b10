package day53_OOP_Summary;

public class FamilyRunner {

	public static void main(String[] args) {
		
		System.out.println("==== KID is spending===");
		RichieRich kid = new RichieRich();
		kid.spendDaily(5000000);
		
		System.out.println("==== Father is spending===");
		RichardRich father = new RichardRich();
		father.spendDaily(50000);
		
		System.out.println("==== Grandfather is spending===");
		RichardThe4th grandfather = new RichardThe4th();
		grandfather.spendDaily(500000000);
		
		
	}

}

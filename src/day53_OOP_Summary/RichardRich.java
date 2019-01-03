package day53_OOP_Summary;

public class RichardRich extends Family{
	
	public void spendDaily(int i) {
		if(i>5_000_000) {
			System.out.println("Son, You have been rejected. "
					+ "Please enter a value below 5million");
		}else {
			System.out.println("Puchase made.");
		}
	}
}

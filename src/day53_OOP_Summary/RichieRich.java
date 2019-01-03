package day53_OOP_Summary;

public class RichieRich extends Family {

	public void spendDaily(int i) {
		if(i>50_000) {
			System.out.println("Son, You have been rejected" 
		+ "Please enter a value below 50Thousand dollars");
		}else {
			System.out.println("Puchase made.");
		}
	}

}

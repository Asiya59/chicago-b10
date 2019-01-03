package day53_OOP_Summary;

public class ElectricDictionary extends Library {
	
	@Override
	public void readBackwards(String str) {
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}

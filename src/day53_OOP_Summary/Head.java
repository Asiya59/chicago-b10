package day53_OOP_Summary;

public class Head {

	public static void main(String[] args) {
		
		Headphones headphone = new Headphones();
		
		headphone.setType("abc");
		System.out.println(headphone.getType());
		
		headphone.setPrice(350);
		System.out.println(headphone.getPrice());
		
		headphone.setSoundQuality("medium");
		System.out.println(headphone.getSoundQuality());
		
	}

}

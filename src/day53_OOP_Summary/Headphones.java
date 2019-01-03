package day53_OOP_Summary;

public class Headphones {
	
	private String type;
	private String soundQuality;
	private int price;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if(type.equals("inEar") || type.equals("onEar") || type.equals("overTheEar"))
		{
			this.type =  type;
		}else {
			System.out.println("Data is not matching. "
					+ "Please enter one of the following: inEar, onEar, overTheEar");
		}
		
	}
	public String getSoundQuality() {
		return soundQuality;
	}
	public void setSoundQuality(String soundQuality) {
		if(soundQuality.equals("poor")||soundQuality.equals("medium") || soundQuality.equals("high"))
		{
		this.soundQuality = soundQuality;
		}else
		{
			System.out.println("Data is not matching. "
					+ "Please enter one of the following: poor, medium, high");
		}
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price>=20 && price<=500) {
			this.price = price;
		}else {
			System.out.println("Data is not matching. "
					+ "Please enter one of the following: number in between 20-500");
		}
		
		
	}
	
}

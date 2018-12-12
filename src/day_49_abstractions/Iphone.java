package day_49_abstractions;

public class Iphone extends Phone implements WiFi{
	
	@Override
	public void connectWiFi() {
		System.out.println("Iphone is connecting to wifi");
	}

	@Override
	public void searchWiFi() {
		System.out.println("Iphone is searching for available wifi");
	}
	
	@Override
	public void call() {
		System.out.println("Iphone is calling");
	}
	
	@Override
	public void receiveCall() {
		System.out.println("Recieving a call in Iphone style");
	}
	
	
	
	
	
}












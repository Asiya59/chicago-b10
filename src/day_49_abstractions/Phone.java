package day_49_abstractions;

 public abstract class Phone extends Device{

	 public abstract void call();
	 	 
	 public abstract void receiveCall();
	 
	@Override
	public void charge() {
		System.out.println("Implemented in Phone class");
	}
	
	 public void text() {
		 System.out.println("Texting to other phones");
	 }
}

package day_52_oop_summary;

public class Computer {
	
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		if(memory < 0) {
			System.out.println("Invalid memory value. Please try again");
		}else {
			this.memory = memory;

		}
	}
	
	
	
}

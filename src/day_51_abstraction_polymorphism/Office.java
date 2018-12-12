package day_51_abstraction_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Office {

	public static void main(String[] args) {
		
		Chair h = new Humanscale();
		h.sit();
		
		((Humanscale)h).rollBack();
		((Humanscale)h).fold();
		h.sit();
		Humanscale temp = ((Humanscale)h);
		temp.unfold();
		
	}
}















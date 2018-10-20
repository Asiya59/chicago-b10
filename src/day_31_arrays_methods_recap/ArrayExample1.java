package day_31_arrays_methods_recap;

public class ArrayExample1 {

	public static void main(String [] args) {
		
		String [] carBrands = {"mercedes","bmw","toyota","ferrari"};
		
		for(int i=0; i<carBrands.length; i++) {
			
			if(carBrands[i] == "mercedes") {
				System.out.println(carBrands[i] + ": Luxury-Comfort");
			}else if(carBrands[i] == "bmw"){
				System.out.println(carBrands[i] + ": Luxury-Sport");
			}else if(carBrands[i]=="toyota") {
				System.out.println(carBrands[i] + ": Reliable-Cheap");
			}else {
				System.out.println(carBrands[i] + ": Super car- Super expensive");
			}
			
		}
	}
		
}

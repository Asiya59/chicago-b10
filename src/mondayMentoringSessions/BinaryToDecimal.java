package mondayMentoringSessions;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		

	int[] i = {0, 0, 0, 0, 0, 0, 1, -1};
	int[] j = {1, 1, 1, 1, 1, 1, 1, 1};
	binaryToDecimalAslan(i);
	binaryToDecimalOlga(i);
	}
	
	public static void binaryToDecimalAslan(int[] binary){
		if(binary == null ) {
			System.out.println("Null input is invalid");
			return;
		}
		int dec = 0;
		    for(int i = 0; i<binary.length; i++){
		    	if(binary[i] < 0 || binary[i] > 1) {
		    		System.out.println("Invalid input, Should be 1 or 0");
		    		return;
		    	}
		      dec*=2;
		      dec += binary[i];
		    }
		    System.out.println(dec);
		    }

	public static void binaryToDecimalOlga(int[] binary){
		int dec = 0;
		int value = 1;
		//{0, 0, 0, 0, 0, 0, 1, 1};
		    for(int i = binary.length-1; i>= 0; i--){
		      if(binary[i] == 1) {
		    	  dec += value;
		      }
		      value *= 2;
		    }
		    System.out.println(dec);
		    }
}

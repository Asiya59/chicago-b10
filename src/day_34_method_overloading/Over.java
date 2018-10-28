package day_34_method_overloading;

public class Over {

	public static void main(String[] args) {

		for(int i=0; i<4; i++) {
			System.out.println("");
			for(int j=0; j<5; j++) {
				
				if(i==1||i==2) {
					if(j==0||j==4) {
						System.out.print("x");
					}else {
						System.out.print(" ");
					}
				}else {
					System.out.print("x");
				}
				
			}
		}

	}

	public static int add(int a, int b) {
		return a+b;
	}


}

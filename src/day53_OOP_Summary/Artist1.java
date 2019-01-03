package day53_OOP_Summary;

public class Artist1 extends Fibonacci{
	
	@Override
	public void Fibonacci(int i) {
		
		int num1=0;
		int num2=1;
		int sum = num1 + num2;
		
		System.out.print (num1 + " " + num2 +  " " + sum + " ");
		
		
		while(sum < i) {
			num1 = num2;
			num2 = sum;
			
			sum= num1 + num2;
			if(sum>i) {
				break;
			}
			System.out.print(sum + " ");
		}
		
		
	}
	
}

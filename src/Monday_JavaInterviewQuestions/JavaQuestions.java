package Monday_JavaInterviewQuestions;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class JavaQuestions {

	public static void main(String[] args) {
		
		System.out.println("The location of index: "+ findFib(1));
		
		// 15/3= 5
		
		divisionDetails(20, 3);
		
		
		
		int num1 = 3;
		int num2 = 5;
		int printNum=0;
		
		for(int i=0; i<num2; i++) {
			printNum=num1*2;
			num1 = printNum;
			System.out.print(" "+printNum);
		}
		
		System.out.println();
		System.out.println("The maxCount: "+maxCount("aabbca"));
	}
	
	public static int findFib(int n) {
		// 0, 1, 1, 2, 3, 5, 8 ... 
		int returNum =0;
		int number2 = 1;
		int sum = 0;
		
		if(n<=0) {
			System.out.print("Invalid number!");
			return 0;
		}
		if(n==1) {
			return 0;
		}
		for(int i=1; i<n; i++) {
			sum = returNum +number2;
			returNum = number2;
			number2 = sum;
		}
		return returNum;
		
	}
	
	public static void divisionDetails(int number, int divisor) {
		//
		int quotient = 0;
		int remainder;
		while(number>=divisor) {
			number = number- divisor;
			quotient++;
		}
		remainder = number;
		System.out.println("The quotient: "+ quotient+ " and "+remainder);
		
	}
	
	public static int[] reverseArray(int[] array) {
		int[] array2 = new int[array.length];
		for(int i=0; i<array.length; i++) {
			array2[i] = array[array.length-1-i];
		}
		return array2;
	}
	
	public static int maxCount(String str) {
		int count=0;
		int maxCount=0;
		for(int i=0; i<str.length(); i++) {
			count=0;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			if(maxCount<count) {
				maxCount=count;
			}
			
		}
		
		
		return maxCount;
	}

	
	
	
	
	
}

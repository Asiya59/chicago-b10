package day_37_wrapper_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNum {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> nums = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			System.out.println("Please enter the number:");
			int number = scan.nextInt();
			if(number % 2 == 0) {
				nums.add(number);
			}
		}
		System.out.println(nums);
	}

}











package tests;

import java.util.Arrays;

public class HW {

	public static void main(String[] args) {
		int [] [] nums = {{3,3,4,2}, {3,5,7}, {45,23,1,2,3,4}, {34,23}};
		printTwoDimentional(nums);
	}

	public static void printTwoDimentional(int[][] nums) {
		int maxSum = 0;
		int sum = 0;
		for(int [] inner: nums) {
			for(int i: inner) {
				sum += i;
			}
			if(sum > maxSum)
				maxSum = sum;
			sum = 0;
		}
		System.out.println(maxSum);
		for(int [] inner: nums) {
			for(int i: inner) {
				sum += i;
			}
			if(sum == maxSum) {
				System.out.println(Arrays.toString(inner));
				break;
			}
			sum = 0;
		}
		
	}
}

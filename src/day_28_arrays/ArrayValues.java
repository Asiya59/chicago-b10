package day_28_arrays;

import java.util.Arrays;

import day_45_inheritance.Dog;
import day_45_inheritance.ServiceDog;

public class ArrayValues {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		Huskey h = new Huskey();
		ServiceDog dog = new ServiceDog();
		
		
		String [] names = {"james", "john", "Adam"};
		int [] nums = {12,23,34,45};
		
		String myNames = Arrays.toString(nums);
		System.out.println(myNames);
		System.out.println(myNames.substring(2, 4));
	}

}

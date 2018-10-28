package day_36_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListTaks3 {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("James");
		names.add("Adam");
		names.add("obam");
		names.add("Jamie");
		removeElements(names, 4);
	}
	
	public static void removeElements(List<String> list, int size) {
//		System.out.println(list);
		List<String> newList = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).length() != size) {
				newList.add(list.get(i));
			}
		}
		System.out.println(newList);
	}

}










package day_44_statics;

import java.util.ArrayList;
import java.util.List;

public class FacebookFans {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("James Bond");
		names.add("Karim Benzema");
		names.add("Christino Ronaldo");
		names.add("Steven Gerrard");
		names.add("Jon Smoke");
		names.add("Lionel Messi");
		FacebookApp.loadUsers(names);
		FacebookApp.seeAllFacebookUsers();
		
		Post p1 = new Post();
		p1.setBody("I scored today! And I am happy");
		p1.setDate("Nov 11, 2018");
		p1.setLikes(2344);
		
		FacebookUser benzema = FacebookApp.users.get(1);
		benzema.post(p1);
		System.out.println("-----------");
//		FacebookApp.removeUser(benzema);
//		FacebookApp.seeAllFacebookUsers();
		FacebookUser gerrard = FacebookApp.users.get(3);
		FacebookUser smoke = FacebookApp.users.get(4);
		smoke.sendFriendRequest(gerrard);
		System.out.println(gerrard.requests.get(0).name);
	}

}










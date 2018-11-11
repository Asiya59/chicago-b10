package day_44_statics;

import java.util.ArrayList;
import java.util.List;

public class FacebookApp {

	static List<FacebookUser> users = new ArrayList<>();
	
	public static void loadUsers(List<String> names) {
		for(String name: names) {
			String username = CustomData.generateUsername(name);
			String password = CustomData.generatePassword(name);
			FacebookUser user = new FacebookUser(username, password, name);
			users.add(user);
		}
	}
	
	public static void seeAllFacebookUsers() {
		for(FacebookUser user: users) {
			user.userInfo();
			System.out.println();
		}
	}
	
	public static boolean userExists(String username) {
		for(FacebookUser user: users) {
			if(user.username.equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	public static void addUser(FacebookUser user) {
		if(userExists(user.username)) {
			System.out.println("User already exists in the system!");
		}
		else {
			users.add(user);
		}
	}
	
	public static void removeUser(FacebookUser user) {
		for(FacebookUser u: users) {
			if(u.username.equals(user.username)) {
				users.remove(user);
				break;
			}
		}
	}
	
	
}













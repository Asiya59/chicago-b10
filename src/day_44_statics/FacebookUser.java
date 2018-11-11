package day_44_statics;

import java.util.ArrayList;
import java.util.List;

public class FacebookUser {
	
	String name;
	String username;
	String password;
	int age;
	int numOfFriends;
	List<Post> posts = new ArrayList<>();
	List<FacebookUser> requests = new ArrayList<>();

	
	public FacebookUser(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public FacebookUser(String username, String password, String name) {
		if(!password.contains(username)) {
			this.password = password;
		}
		else {
			System.out.println("Password can't contain username. Please change password.");
			this.password = "";
		}
		this.username = username;
		this.name = name;
	}
	
	public void post(Post post) {
		System.out.println("\nNew Post from " + name + "\n");
		post.postInfo();
		posts.add(post);
	}
	
	public static void deleteAccount(FacebookUser user) {
		user.age = 0;
		user.name = null;
		user.username = null;
		user.password = null;
		user.numOfFriends = 0;
		
	}
	
	public static void seeUsersInfo(FacebookUser user) {
		
		user.userInfo();
	}
	
	public boolean sendFriendRequest(FacebookUser targetUser) {
		if(targetUser.numOfFriends < 5000) {
			System.out.println("Friend Request from "+username+ " sent to " + targetUser.username);
			targetUser.requests.add(this);
			return true;
		}
		else {
			System.out.println(targetUser.username + " can't accept friend requests!");
			return false;
		}
	}
	
	public void userInfo() {
		System.out.println("Name: " + name);
		System.out.println("Username: " + this.username);
		System.out.println("Age: " + this.age);
		System.out.println("Number of Friends: " + this.numOfFriends);
	}

}












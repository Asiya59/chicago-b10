package FacebookAslan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FakebookUser {
	String username;
	String password;
	String name;
	int age;
	List<FakebookUser> friends = new ArrayList<>();
	List<FakebookUser> friendRequests = new ArrayList<>();
	List<UserPost> userPosts = new ArrayList<>();
	
	static List<FakebookUser> allUsers = new ArrayList<>();
	
	
	
	public FakebookUser(String name, String username, String password) {
		this.name = name;
		
		if(userExists(username) == -1) {
			this.username = username;
		}else {
			System.out.println("Username is not available.");
		}
		
		if(password.contains(name) || password.contains(username)) {
			System.out.println("Password cannot name or username. Set another.");
		}else {
			this.password = password;
			allUsers.add(this);
		}
	}
	
	public static int userExists(String username) {
		for(int i = 0; i < allUsers.size(); i++) {
			if(allUsers.get(i).username.equals(username)) {
				return i;
			}
		}
		return -1;
	}
	
	public FakebookUser(String username, String password) {
		this.name = "Anonymous";
		
		if(userExists(username) == -1) {
			this.username = username;
		}else {
			System.out.println("Username is not available.");
		}
		
		if(password.contains(name) || password.contains(username)) {
			System.out.println("Password cannot name or username. Set another.");
		}else {
			this.password = password;
			allUsers.add(this);
		}
	}
	
	public void userInfo() {
		System.out.println("Username: " + this.username);
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Number of friends: " + friends.size());
	}
	
	public void seeFriends() {
		for(FakebookUser each : friends) {
			each.userInfo();
		}
	}
	
	public static void seeAllFacebookUsers() {
		for(FakebookUser each : allUsers) {
			each.userInfo();
		}
	}
	
	public static void removeUser(String username) {
		if(userExists(username) > -1) {
			allUsers.remove(userExists(username));
		}else {
			System.out.println("Unable to remove the user, cuz no such username exists.");
		}
	}
	
	public void sendFriendRequest(FakebookUser targetUser) {
		if(targetUser.friends.size() < 5000) {
			targetUser.friendRequests.add(this);
			System.out.println("Friend request sent to " + targetUser.username);
		}else {
			System.out.println(targetUser.username + " cannot accept friend requests.");
		}
	}
	
	public void acceptRequests() {
		Scanner s = new Scanner(System.in);
		for(FakebookUser each : this.friendRequests) {
			System.out.println("You have a friend request from: ");
			each.userInfo();
			System.out.println("Do you want to accept friend request from "+ each.username + "? Yes/No");
			String answer = s.next();
			if(answer.equalsIgnoreCase("yes")) {
				this.friends.add(each);
				each.friends.add(this);
			}else {
				this.friendRequests.remove(each);
			}
		}this.friendRequests.removeAll(this.friends);
	}
	
	public void post(UserPost post) {
		this.userPosts.add(post);
		System.out.println("Your post is here: ");
		post.postInfo();
	}
	
	
	
	
	
	
	
}

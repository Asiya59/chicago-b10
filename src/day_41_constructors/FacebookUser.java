package day_41_constructors;

public class FacebookUser {
	
	String name;
	String username;
	String password;
	int age;
	int numOfFriends;
	
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
	
	public boolean sendFriendRequest(FacebookUser targetUser) {
		if(targetUser.numOfFriends < 5000) {
			System.out.println("Friend Request sent to " + targetUser.username);
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












package com.geekymv.test;

public class NoClassDefFoundErrorTest {
	
	public static void main(String[] args) {
		
		User user = new User("1");
		
	}

}


class User {
	public static String USER_ID = getUserId();
	
	public User(String userId) {
		this.USER_ID = userId;
	}
	
	private static String getUserId() {
		throw new RuntimeException("user id nof found");
	}
	
}

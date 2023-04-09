package info.ashutosh.design.creational.builderdesignPattern.builderDP1.client;

import info.ashutosh.design.creational.builderdesignPattern.builderDP1.builder.User;

public class Snippet {
	public static void main(String[] args) {
		
		User user = new User.UserBuilder("johndoe", "johndoe@example.com", "password")
				.firstName("John")
				.lastName("Doe")
				.age(30)
				.build();
		System.out.println(user);
	}
}

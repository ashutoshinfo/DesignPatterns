package info.ashutosh.design.creational.builderdesignPattern.builderDP1.builder;

public class User {

	private final String username;
	private final String email;
	private final String password;
	private final String firstName;
	private final String lastName;
	private final int age;

	private User(UserBuilder builder) {
		this.username = builder.username;
		this.email = builder.email;
		this.password = builder.password;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
	}

	public static class UserBuilder {
		private final String username;
		private final String email;
		private final String password;
		private String firstName;
		private String lastName;
		private int age;

		public UserBuilder(String username, String email, String password) {
			this.username = username;
			this.email = email;
			this.password = password;

		}

		public UserBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public UserBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public User build() {
			return new User(this);
		}

		@Override
		public String toString() {
			return "UserBuilder [username=" + username + ", email=" + email + ", password=" + password + ", firstName="
					+ firstName + ", lastName=" + lastName + ", age=" + age + "]";
		}

	}

}

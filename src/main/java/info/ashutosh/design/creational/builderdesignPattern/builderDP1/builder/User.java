package info.ashutosh.design.creational.builderdesignPattern.builderDP1.builder;

public class User {

	static {
		System.out.println("User.enclosing_method()");
	}
	
	{
		System.out.println("User.enclosing_method()");
	}
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

	public User() {
		this.username = "";
		this.email = "";
		this.password = "";
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		System.out.println("User.User()");
	}

	public static class UserBuilder {
		private final String username;
		private final String email;
		private final String password;
		private String firstName;
		private String lastName;
		private int age;

		static {
			System.out.println("User.UserBuilder.enclosing_method()");
		}

		{
			System.out.println("User.UserBuilder.enclosing_method()");
		}

		public UserBuilder() {
			this.username = "";
			this.email = "";
			this.password = "";
			this.firstName = "";
			this.lastName = "";
			this.age = 0;
			System.out.println("User.UserBuilder.UserBuilder()");
		}

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

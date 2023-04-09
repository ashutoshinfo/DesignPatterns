package info.ashutosh.design.creational.builderdesignPattern.builderDP2.builder;

public class Person {
	static{
		System.out.println("Person.static block");
	}
	{
		System.out.println("Person.instenc block");
	}

	private final String firstName;
	private final String lastName;
	private final int age;
	private final String address;
	private final String phone;

	public Person() {
		firstName = "";
		lastName = "";
		address = "";
		phone = "";
		age = 0;
		System.out.println("Person.Person()");
	}

	private Person(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.address = builder.address;
		this.phone = builder.phone;
		System.out.println("Person.Person(-)");
	}

	public static class Builder extends Person{
		static{
			System.out.println("Person.Builder.static block()");
		}

		{
			System.out.println("Person.Builder Instance block");
		}

		private final String firstName;
		private final String lastName;
		private int age;
		private String address;
		private String phone;

		public Builder() {
			this.firstName = "";
			this.lastName = "";
			System.out.println("Person.Builder.Builder()");
		}

		public Builder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
			System.out.println("Person.Builder.Builder(-,-)");
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public Person build() {
			System.out.println("Person.Builder.build()");
			return new Person(this);
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}
}

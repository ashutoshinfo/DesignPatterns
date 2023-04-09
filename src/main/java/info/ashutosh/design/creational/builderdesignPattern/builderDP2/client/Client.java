package info.ashutosh.design.creational.builderdesignPattern.builderDP2.client;

import info.ashutosh.design.creational.builderdesignPattern.builderDP2.builder.Person;
import info.ashutosh.design.creational.builderdesignPattern.builderDP2.builder.Person.Builder;

public class Client {
	public static void main(String[] args) {
		//Person person2=new Person();
//		Builder builder = new Person.Builder();
//		Builder builder2 = new Builder();
		System.out.println("-----------------------");
		Person person = new Person.Builder("John", "Doe")
	                        .age(30)
	                        .address("123 Main St")
	                        .phone("555-1234")
	                        .build();
		System.out.println("-----------------------");
		System.out.println(person.getAddress());
		System.out.println(person);
		System.out.println("-----------------------");
		Person person3 = new Person.Builder("John", "Doe")
                .age(30)
                .address("123 Main St")
                .phone("555-1234")
                .build();
	}
	
}


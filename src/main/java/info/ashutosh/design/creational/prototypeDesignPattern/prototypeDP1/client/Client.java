package info.ashutosh.design.creational.prototypeDesignPattern.prototypeDP1.client;

import info.ashutosh.design.creational.prototypeDesignPattern.prototypeDP1.Product.Animal;
import info.ashutosh.design.creational.prototypeDesignPattern.prototypeDP1.Product.impl.Dog;
import info.ashutosh.design.creational.prototypeDesignPattern.prototypeDP1.Product.impl.Identity;
import info.ashutosh.design.creational.prototypeDesignPattern.prototypeDP1.prototype.CloneFactory;

public class Client {

	public static void main(String[] args) {

		Dog dog = new Dog(new Identity("1"), "Lucky");

		Animal clone = CloneFactory.getClone(dog);

		System.out.println(dog.hashCode());
		System.out.println(clone.hashCode());

		System.out.println(dog);
		System.out.println(clone);

		dog.setName("Lucy");
		dog.getIdentity().setId("2");

		System.out.println(dog);
		System.out.println(clone);

	}

}

package info.ashutosh.design.creational.prototypeDesignPattern.prototypeDP1.Product.impl;

import info.ashutosh.design.creational.prototypeDesignPattern.prototypeDP1.Product.Animal;

public class Dog implements Animal {

	private Identity identity;

	private String name;

	public Dog(Identity identity, String name) {
		super();
		this.identity = identity;
		this.name = name;
	}

	@Override
	public Animal makeCopy() {
		try {
			return (Animal) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("Dog.clone()");
		Identity identity = new Identity(this.identity.getId());
		Dog dog = new Dog(identity, name);
		return dog;

	}

	// getter-Setter
	public Identity getIdentity() {
		return identity;
	}

	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [identity=" + identity + ", name=" + name + "]";
	}

}

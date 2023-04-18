package info.ashutosh.design.creational.prototypeDesignPattern.simpleClone;

class Identity {
	int id;

	public Identity(int id) {
		this.id = id;
	}
}

public class Dog implements Cloneable {
	Identity identity;
	String name;

	public Dog(Identity identity, String name) {
		this.identity = identity;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Identity identity2 = new Identity(this.identity.id);
		Dog dog = new Dog(identity2, this.name);

		return dog;
	}
}

class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Dog dog = new Dog(new Identity(123), "Tommy");
		Dog clone = (Dog) dog.clone();

		System.out.println("After clone- Before change");
		System.out.println("Dog  - " + dog.name + " | " + dog.identity.id + " | " + dog.hashCode() + " | " + dog.identity.hashCode());
		System.out.println("Clone- " + clone.name + " | " + clone.identity.id + " | " + clone.hashCode() + " | " + clone.identity.hashCode() + "\n");

		dog.identity.id = 345;
		clone.identity.id = 2222;

		System.out.println("After clone- After change");
		System.out.println("Dog  - " + dog.name + " | " + dog.identity.id + " <-- change in original");
		System.out.println("Clone- " + clone.name + " | " + clone.identity.id + " <-- clone reflacted");

	}
}

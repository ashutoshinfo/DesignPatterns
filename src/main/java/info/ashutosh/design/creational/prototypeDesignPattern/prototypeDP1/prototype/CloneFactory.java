package info.ashutosh.design.creational.prototypeDesignPattern.prototypeDP1.prototype;

import info.ashutosh.design.creational.prototypeDesignPattern.prototypeDP1.Product.Animal;

public class CloneFactory {

	public static Animal getClone(Animal animal) {

		return animal.makeCopy();
	}
}

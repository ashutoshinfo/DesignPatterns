package info.ashutosh.design.creational.factoryPattern.solution.producer.impl;

import info.ashutosh.design.creational.factoryPattern.solution.producer.Car;

public class LuxuryCar extends Car {

	private String bootspace;
	private String security;

	public LuxuryCar() {
		System.out.println("LuxuryCar.assemble()");
	}

	// Getters & Setters

	@Override
	public void assemble() {
		System.out.println("LuxuryCar.assemble()");
	}

	@Override
	public void roadTest() {
		System.out.println("LuxuryCar.roadTest()");
	}

	@Override
	public void drive() {
		System.out.println("LuxuryCar.drive()");
	}

}

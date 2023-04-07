package info.ashutosh.design.creational.factoryPattern.solution.producer.impl;

import info.ashutosh.design.creational.factoryPattern.solution.producer.Car;

public class SportCar extends Car {

	private String speed;
	private String acceleration;// pick-up , Torque

	public SportCar() {
		System.out.println("SportCar.SportCar()");
	}

	// Getters & Setters

	@Override
	public void assemble() {
		System.out.println("SportCar.assemble()");
	}

	@Override
	public void roadTest() {
		System.out.println("SportCar.roadTest()");
	}

	@Override
	public void drive() {
		System.out.println("SportCar.drive()");
	}

}

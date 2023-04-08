package info.ashutosh.design.creational.factoryPattern.factoryPattern2.solution.producer.impl;

import info.ashutosh.design.creational.factoryPattern.factoryPattern2.solution.producer.Car;

public class BudgetCar extends Car {

//	private String fuel;
//	private String price;

	public BudgetCar() {
		System.out.println("BudgetCar.BudgetCar()");
	}

	// Getters & Setters

	@Override
	public void assemble() {
		System.out.println("BudgetCar.assemble()");
	}

	@Override
	public void roadTest() {
		System.out.println("BudgetCar.roadTest()");
	}

	@Override
	public void drive() {
		System.out.println("BudgetCar.drive()");
	}

}

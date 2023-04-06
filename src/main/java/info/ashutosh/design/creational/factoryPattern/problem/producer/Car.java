package info.ashutosh.design.creational.factoryPattern.problem.producer;

public abstract class Car {

	private String name;
	private String regNo;

	public abstract void assemble();

	public abstract void roadTest();

	public abstract void drive();

}

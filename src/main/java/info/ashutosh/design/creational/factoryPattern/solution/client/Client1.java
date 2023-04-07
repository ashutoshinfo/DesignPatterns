package info.ashutosh.design.creational.factoryPattern.solution.client;

import info.ashutosh.design.creational.factoryPattern.solution.enums.CarType;
import info.ashutosh.design.creational.factoryPattern.solution.factory.CarFactory;
import info.ashutosh.design.creational.factoryPattern.solution.producer.Car;

public class Client1 {

	public static void main(String[] args) {
		Car supply = CarFactory.supply(CarType.BUDGET);
		supply.drive();
	}

}

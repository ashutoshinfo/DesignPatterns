package info.ashutosh.design.creational.factoryPattern.factoryPattern2.solution.client;

import info.ashutosh.design.creational.factoryPattern.factoryPattern2.solution.enums.CarType;
import info.ashutosh.design.creational.factoryPattern.factoryPattern2.solution.factory.CarFactory;
import info.ashutosh.design.creational.factoryPattern.factoryPattern2.solution.producer.Car;

public class Client1 {

	public static void main(String[] args) {
		Car supply = CarFactory.supply(CarType.BUDGET);
		supply.drive();
	}

}

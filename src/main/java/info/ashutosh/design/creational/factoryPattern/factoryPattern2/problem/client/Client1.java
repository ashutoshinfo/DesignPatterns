package info.ashutosh.design.creational.factoryPattern.factoryPattern2.problem.client;

import info.ashutosh.design.creational.factoryPattern.factoryPattern2.problem.producer.impl.SportCar;

public class Client1 {

	public static void main(String[] args) {

		SportCar sportCar = new SportCar();
		sportCar.assemble();
		sportCar.roadTest();
		sportCar.drive();
	}

}

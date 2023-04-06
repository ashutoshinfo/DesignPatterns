package info.ashutosh.design.creational.factoryPattern.solution.client;

import info.ashutosh.design.creational.factoryPattern.problem.producer.impl.SportCar;

public class Client1 {

	public static void main(String[] args) {

		SportCar sportCar = new SportCar();
		sportCar.assemble();
		sportCar.roadTest();
		sportCar.drive();
	}

}

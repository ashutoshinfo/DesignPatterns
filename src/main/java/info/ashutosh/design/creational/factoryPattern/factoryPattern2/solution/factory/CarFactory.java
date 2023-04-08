package info.ashutosh.design.creational.factoryPattern.factoryPattern2.solution.factory;

import info.ashutosh.design.creational.factoryPattern.factoryPattern2.solution.enums.CarType;
import info.ashutosh.design.creational.factoryPattern.factoryPattern2.solution.producer.Car;
import info.ashutosh.design.creational.factoryPattern.factoryPattern2.solution.producer.impl.BudgetCar;
import info.ashutosh.design.creational.factoryPattern.factoryPattern2.solution.producer.impl.LuxuryCar;
import info.ashutosh.design.creational.factoryPattern.factoryPattern2.solution.producer.impl.SportCar;

// Factory Design Pattern
public class CarFactory {

	public static Car supply(CarType carName) {

		Car car = null;
		switch (carName) {
		case BUDGET:
			car = new BudgetCar();
			assembleCar(car);
			return car;
		case LUXURY:
			car = new LuxuryCar();
			assembleCar(car);
			return car;
		case SPORT:
			car = new SportCar();
			assembleCar(car);
			return car;
		default:
			throw new IllegalArgumentException("Unknown Car Type: " + carName);
		}

	}

	private static void assembleCar(Car car) {
		car.assemble();
		car.roadTest();
	}

}

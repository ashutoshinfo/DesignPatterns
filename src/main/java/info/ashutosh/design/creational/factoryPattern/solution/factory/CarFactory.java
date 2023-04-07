package info.ashutosh.design.creational.factoryPattern.solution.factory;

import info.ashutosh.design.creational.factoryPattern.solution.enums.CarType;
import info.ashutosh.design.creational.factoryPattern.solution.producer.Car;
import info.ashutosh.design.creational.factoryPattern.solution.producer.impl.BudgetCar;
import info.ashutosh.design.creational.factoryPattern.solution.producer.impl.LuxuryCar;
import info.ashutosh.design.creational.factoryPattern.solution.producer.impl.SportCar;

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

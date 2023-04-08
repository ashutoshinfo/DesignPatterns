package info.ashutosh.design.creational.factoryPattern.factoryPattern1.client;

import info.ashutosh.design.creational.factoryPattern.factoryPattern1.car.AirBag;
import info.ashutosh.design.creational.factoryPattern.factoryPattern1.car.Car;
import info.ashutosh.design.creational.factoryPattern.factoryPattern1.car.Chassis;
import info.ashutosh.design.creational.factoryPattern.factoryPattern1.car.Color;
import info.ashutosh.design.creational.factoryPattern.factoryPattern1.car.Engin;
import info.ashutosh.design.creational.factoryPattern.factoryPattern1.car.Glass;
import info.ashutosh.design.creational.factoryPattern.factoryPattern1.car.Interior;
import info.ashutosh.design.creational.factoryPattern.factoryPattern1.car.Seat;
import info.ashutosh.design.creational.factoryPattern.factoryPattern1.car.SoundSystem;
import info.ashutosh.design.creational.factoryPattern.factoryPattern1.car.SteeringWheel;
import info.ashutosh.design.creational.factoryPattern.factoryPattern1.car.Tyre;

public class Client {

	public static void main(String[] args) {
		AirBag airBag = new AirBag();
		Chassis chassis = new Chassis();
		Color color = new Color();
		Engin engin = new Engin();
		Glass glass = new Glass();
		Interior interior = new Interior();
		Seat seat = new Seat();
		SoundSystem soundSystem = new SoundSystem();
		SteeringWheel steeringWheel = new SteeringWheel();
		Tyre tyre = new Tyre();

		Car car = new Car();
		car.setAirBag(airBag);
		car.setChassis(chassis);
		car.setColor(color);
		car.setEngin(engin);
		car.setGlass(glass);
		car.setInterior(interior);
		car.setSeat(seat);
		car.setSoundSystem(soundSystem);
		car.setSteeringWheel(steeringWheel);
		car.setTyre(tyre);

	}
}
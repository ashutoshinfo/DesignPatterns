package info.ashutosh.design.creational.factoryMethodPattern.factoryPattern.car;

public abstract class Car {

	private String registerNo;

	private Chassis chassis;
	private Tyre tyre;
	private Engin engin;
	private Interior interior;
	private Glass glass;
	private Seat seat;
	private SoundSystem soundSystem;
	private SteeringWheel steeringWheel;
	private Color color;
	private AirBag airBag;

	public abstract void testing();

}

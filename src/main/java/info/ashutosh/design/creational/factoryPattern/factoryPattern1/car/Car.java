package info.ashutosh.design.creational.factoryPattern.factoryPattern1.car;

public class Car {

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

	public String getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	public Chassis getChassis() {
		return chassis;
	}

	public void setChassis(Chassis chassis) {
		this.chassis = chassis;
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public Engin getEngin() {
		return engin;
	}

	public void setEngin(Engin engin) {
		this.engin = engin;
	}

	public Interior getInterior() {
		return interior;
	}

	public void setInterior(Interior interior) {
		this.interior = interior;
	}

	public Glass getGlass() {
		return glass;
	}

	public void setGlass(Glass glass) {
		this.glass = glass;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public SoundSystem getSoundSystem() {
		return soundSystem;
	}

	public void setSoundSystem(SoundSystem soundSystem) {
		this.soundSystem = soundSystem;
	}

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public AirBag getAirBag() {
		return airBag;
	}

	public void setAirBag(AirBag airBag) {
		this.airBag = airBag;
	}
}

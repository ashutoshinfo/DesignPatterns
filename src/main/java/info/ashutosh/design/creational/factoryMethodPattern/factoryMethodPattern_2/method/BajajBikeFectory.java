package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.method;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.bike.BajajBike;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_2.enums.ModelType;

// Factory Method Pattern
public abstract class BajajBikeFectory {
	public abstract void painting();

	public abstract void assambling();

	public abstract void engineTest();

	public abstract void roadTest();

	public abstract BajajBike createBike(ModelType modelType);

	public BajajBike orderBike(ModelType modelType) {
		BajajBike bajajBike = createBike(modelType);
		painting();
		assambling();
		engineTest();
		roadTest();
		return bajajBike;
	}

}

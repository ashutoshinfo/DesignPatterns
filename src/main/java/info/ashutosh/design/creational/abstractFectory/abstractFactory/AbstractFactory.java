package info.ashutosh.design.creational.abstractFectory.abstractFactory;

import info.ashutosh.design.creational.abstractFectory.enums.FactoryType;
import info.ashutosh.design.creational.abstractFectory.factory.CommonFactoryRules;
import info.ashutosh.design.creational.abstractFectory.factory.FirstCopyFactory;
import info.ashutosh.design.creational.abstractFectory.factory.NokiaFactory;

public class AbstractFactory {

	public static CommonFactoryRules supplyFactory(FactoryType factoryType) {

		switch (factoryType) {
		case NOKIA:
			return new NokiaFactory();
		case FIRST_COPY:
			return new FirstCopyFactory();
		default:
			throw new IllegalArgumentException("Unknown factory: " + factoryType);
		}

	}
}

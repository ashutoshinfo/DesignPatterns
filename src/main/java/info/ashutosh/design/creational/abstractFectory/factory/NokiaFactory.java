package info.ashutosh.design.creational.abstractFectory.factory;

import info.ashutosh.design.creational.abstractFectory.enums.PartType;
import info.ashutosh.design.creational.abstractFectory.poducer.Parts;
import info.ashutosh.design.creational.abstractFectory.poducer.battry.impl.NokiaBatteryProduer;
import info.ashutosh.design.creational.abstractFectory.poducer.display.impl.NokiaDisplayProduer;

public class NokiaFactory implements CommonFactoryRules {

	@Override
	public Parts supplyParts(PartType partType) {

		switch (partType) {
		case BATTERY:
			return new NokiaBatteryProduer();
		case DISPLAY:
			return new NokiaDisplayProduer();
		default:
			throw new IllegalArgumentException("Unknown Part Type " + partType);
		}

	}
}

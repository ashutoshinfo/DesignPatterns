package info.ashutosh.design.creational.abstractFectory.factory;

import info.ashutosh.design.creational.abstractFectory.enums.PartType;
import info.ashutosh.design.creational.abstractFectory.poducer.Parts;
import info.ashutosh.design.creational.abstractFectory.poducer.battry.impl.FirstCopyBatteryProducer;
import info.ashutosh.design.creational.abstractFectory.poducer.display.impl.FirstCopyDisplayProducer;

public class FirstCopyFactory implements CommonFactoryRules {

	@Override
	public Parts supplyParts(PartType partType) {

		switch (partType) {
		case BATTERY:
			return new FirstCopyDisplayProducer();
		case DISPLAY:
			return new FirstCopyBatteryProducer();
		default:
			throw new IllegalArgumentException("Unknown notifyType " + partType);
		}

	}

}

package info.ashutosh.design.creational.abstractFectory.factory;

import info.ashutosh.design.creational.abstractFectory.poducer.Parts;
import info.ashutosh.design.creational.abstractFectory.poducer.battry.impl.FirstCopyBattryProducer;
import info.ashutosh.design.creational.abstractFectory.poducer.display.impl.FirstCopyDisplayProducer;

public class FirstCopyFactory implements CommonFactoryRules {

	@Override
	public Parts supplyParts(String partName) {

		switch (partName) {
		case "bettry":
			return new FirstCopyDisplayProducer();
		case "display":
			return new FirstCopyBattryProducer();
		default:
			throw new IllegalArgumentException("Unknown notifyType " + partName);
		}

	}

}

package info.ashutosh.design.creational.abstractFectory.factory;

import info.ashutosh.design.creational.abstractFectory.poducer.Parts;
import info.ashutosh.design.creational.abstractFectory.poducer.battry.impl.NokiaBattryProduer;
import info.ashutosh.design.creational.abstractFectory.poducer.display.impl.NokiaDisplayProduer;

public class NokiaFactory implements CommonFactoryRules {

	@Override
	public Parts supplyParts(String partName) {

		switch (partName) {
		case "bettry":
			return new NokiaBattryProduer();
		case "display":
			return new NokiaDisplayProduer();
		default:
			throw new IllegalArgumentException("Unknown notifyType " + partName);
		}

	}
}

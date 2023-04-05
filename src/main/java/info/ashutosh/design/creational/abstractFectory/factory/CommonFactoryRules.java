package info.ashutosh.design.creational.abstractFectory.factory;

import info.ashutosh.design.creational.abstractFectory.poducer.Parts;

public interface CommonFactoryRules {
	public Parts supplyParts(String partName);
}

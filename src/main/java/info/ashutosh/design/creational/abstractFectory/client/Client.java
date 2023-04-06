package info.ashutosh.design.creational.abstractFectory.client;

import info.ashutosh.design.creational.abstractFectory.abstractFactory.AbstractFactory;
import info.ashutosh.design.creational.abstractFectory.enums.FactoryType;
import info.ashutosh.design.creational.abstractFectory.enums.PartType;
import info.ashutosh.design.creational.abstractFectory.factory.CommonFactoryRules;
import info.ashutosh.design.creational.abstractFectory.poducer.Parts;

public class Client {

	public static void main(String[] args) {
		CommonFactoryRules supplyParts = AbstractFactory.supplyFactory(FactoryType.NOKIA);

		Parts battryPart = supplyParts.supplyParts(PartType.BATTERY);
		try {
			battryPart.battry();
			battryPart.display();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Parts displayPart = supplyParts.supplyParts(PartType.DISPLAY);
		try {
			displayPart.display();
			displayPart.battry();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package info.ashutosh.design.creational.abstractFectory.client;

import info.ashutosh.design.creational.abstractFectory.factory.NokiaFactory;
import info.ashutosh.design.creational.abstractFectory.poducer.Parts;

public class Client1 {

	public static void main(String[] args) {
		NokiaFactory nokiaFactory = new NokiaFactory();
		Parts bettryPart = nokiaFactory.supplyParts("battry");
		Parts displayPart = nokiaFactory.supplyParts("display");
		
		
	}

}

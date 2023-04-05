package info.ashutosh.design.creational.abstractFectory.client;

import info.ashutosh.design.creational.abstractFectory.factory.FirstCopyFactory;
import info.ashutosh.design.creational.abstractFectory.factory.NokiaFactory;
import info.ashutosh.design.creational.abstractFectory.poducer.Parts;

public class Client2 {

	public static void main(String[] args) {
		NokiaFactory nokiaFactory = new NokiaFactory();
		Parts bettryPart = nokiaFactory.supplyParts("battry");
		
		FirstCopyFactory firstCopyFactory =new FirstCopyFactory();
		Parts supplyParts = firstCopyFactory.supplyParts("display");
		
		// Ghapala 
		
		
		
		
	}

}

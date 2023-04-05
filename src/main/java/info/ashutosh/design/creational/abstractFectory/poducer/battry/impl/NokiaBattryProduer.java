package info.ashutosh.design.creational.abstractFectory.poducer.battry.impl;

import info.ashutosh.design.creational.abstractFectory.poducer.battry.Battry;

public class NokiaBattryProduer implements Battry {

	@Override
	public void battry() {
		System.out.println("NokiaDisplayProduer.battry()");
	}

}

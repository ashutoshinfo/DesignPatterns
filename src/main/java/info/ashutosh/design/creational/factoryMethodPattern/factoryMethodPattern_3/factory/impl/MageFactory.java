package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_3.factory.impl;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_3.factory.CharacterFactory;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_3.product.Character;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_3.product.impl.Mage;

public class MageFactory implements CharacterFactory {
	public Character createCharacter() {
		return new Mage();
	}
}

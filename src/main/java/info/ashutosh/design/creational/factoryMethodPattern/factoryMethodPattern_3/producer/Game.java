package info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_3.producer;

import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_3.factory.CharacterFactory;
import info.ashutosh.design.creational.factoryMethodPattern.factoryMethodPattern_3.product.Character;

public class Game {
	private CharacterFactory characterFactory;

	public Game(CharacterFactory characterFactory) {
		this.characterFactory = characterFactory;
	}

	public Character createCharacter() {
		return characterFactory.createCharacter();
	}
}
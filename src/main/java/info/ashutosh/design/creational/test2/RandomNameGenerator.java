package info.ashutosh.design.creational.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNameGenerator {

	private static final List<String> NAMES = new ArrayList<>();
	static {
		NAMES.add("Ashutosh");
		NAMES.add("Awais");
		NAMES.add("Yash");
		NAMES.add("Nayna");
		NAMES.add("Masum");
	}

	public static void main(String[] args) {
		String randomName = getRandomName();
		System.out.println("Next Seminar will Cunducte by: " + randomName);
	}

	private static String getRandomName() {
		Random rand = new Random();
		return NAMES.get(rand.nextInt(NAMES.size()));
	}
}

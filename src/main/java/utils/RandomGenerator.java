package utils;

import java.util.Random;

public class RandomGenerator {
	private final int MIN_NO = 0;
	private final int MAX_NO = 9;
	private final Random random = new Random();

	public int getNumber() {
		return random.nextInt(MAX_NO - MIN_NO) + MIN_NO;
	}

}

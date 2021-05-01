package utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validator {
	private static final String CAR_NAME_DELIMITER = ",";

	public static List<String> checkCarNames(String inputCarNames) {
		List<String> carNames = Arrays.asList(inputCarNames.split(CAR_NAME_DELIMITER));
		checkCarCount(carNames);
		for (String carName : carNames) {
			checkCarNameLength(carName);
		}
		checkDuplicatedCarName(carNames);
		return carNames;
	}

	private static void checkCarCount(List<String> carNames) {
		if (carNames.size() == 1) {
			throw new IllegalArgumentException("1대 이상의 자동차를 입력 해 주세요.");
		}
	}

	private static void checkCarNameLength(String carName) {
		if (carName.length() > 5) {
			throw new IllegalArgumentException("자동차 이름은 최대 5글자 입니다.");
		}
	}

	private static void checkDuplicatedCarName(List<String> carNames) {
		Set set = new HashSet<>(carNames);
		if (set.size() != carNames.size()) {
			throw new IllegalArgumentException("중복된 자동차가 있습니다.");
		}
	}

	public static int checkRoundCount(String inputRoundCount) {
		int roundCount = 0;
		try {
			roundCount = Integer.parseInt(inputRoundCount);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("라운드는 숫자만 입력 가능합니다.");
		}
		checkUnderOneRoundCount(roundCount);
		return roundCount;
	}

	private static void checkUnderOneRoundCount(int roundCount) {
		if (roundCount < 1) {
			throw new IllegalArgumentException("라운드는 1이상만 입력 가능합니다.");
		}
	}

}

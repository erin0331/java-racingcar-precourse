package utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class Validator {
	private static final String CAR_NAME_DELIMITER = ",";
	private static final int MIN_CAR = 2;
	private static final int MAX_CAR_NAME_LENGTH = 5;
	private static final int MIN_ROUND = 1;

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
		if (carNames.size() < MIN_CAR) {
			throw new IllegalArgumentException(StringUtils.join(MIN_CAR, "대 이상의 자동차를 입력 해 주세요."));
		}
	}

	private static void checkCarNameLength(String carName) {
		if (carName.length() > MAX_CAR_NAME_LENGTH) {
			throw new IllegalArgumentException(StringUtils.join("자동차 이름은 최대 ", MAX_CAR_NAME_LENGTH, "글자 입니다."));
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
		if (roundCount < MIN_ROUND) {
			throw new IllegalArgumentException(StringUtils.join("라운드는 ", MIN_ROUND, "이상만 입력 가능합니다."));
		}
	}

}

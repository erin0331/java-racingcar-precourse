import java.util.Arrays;
import java.util.List;

public class CarNames {
	private static List<String> carNames;

	public CarNames(String input) {
		validation(input);
		carNames = Arrays.asList(input.split(","));
	}

	private void validation(String input) {
		if (!input.contains(",")) {
			throw new IllegalArgumentException("1대 이상의 자동차를 입력 해 주세요.");
		}
	}

	public static int getLength() {
		return carNames.size();
	}

	public static String get(int position) {
		return carNames.get(position);
	}

}

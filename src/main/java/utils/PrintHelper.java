package utils;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class PrintHelper {
	private enum Message {
		INPUT_CARS("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
		INPUT_ROUND("시도할 회수는 몇회인가요?"),
		GUIDANCE("실행 결과"),
		RESULT("(이)가 최종 우승했습니다.");
		private String message;

		Message(String message) {
			this.message = message;
		}
	}

	public static final void printInputCars() {
		System.out.println(Message.INPUT_CARS.message);
	}

	public static final void printInputRound() {
		System.out.println(Message.INPUT_ROUND.message);
	}

	public static final void printGuidance() {
		printLine();
		System.out.println(Message.GUIDANCE.message);
	}

	public static final void printScoreStatus(String name, int score) {
		System.out.print(StringUtils.join(name, " : ", printBar(score)));
		printLine();
	}

	public static final void printLine() {
		System.out.println();
	}

	private static String printBar(int score) {
		String bars = "";
		for (int i = 0; i < score; i++) {
			bars = StringUtils.join(bars, "-");
		}
		return bars;
	}

	public static final void printResult(List<String> winnerNames) {
		int winnerCount = winnerNames.size();
		String resultMessage = "";
		for (int i = 0; i < winnerCount; i++) {
			resultMessage = StringUtils.join(resultMessage, winnerNames.get(i), addComma(winnerCount, i));
		}
		System.out.println(StringUtils.join(resultMessage, Message.RESULT.message));
	}

	private static String addComma(int winnerCount, int now) {
		if (winnerCount - 1 == now) {
			return "";
		}
		return ",";
	}

}

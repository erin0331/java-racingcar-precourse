package utils;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class PrintHelper {
	public static void printScoreStatus(String name, int score) {
		System.out.print(StringUtils.join(name, " : ", printBar(score)));
		printLine();
	}

	public static void printLine() {
		System.out.println();
	}

	private static String printBar(int score) {
		String bars = "";
		for (int i = 0; i < score; i++) {
			bars = StringUtils.join(bars, "-");
		}
		return bars;
	}

	public static void printResult(List<String> winnerNames) {
		int winnerCount = winnerNames.size();
		String resultMessage = "";
		for (int i = 0; i < winnerCount; i++) {
			resultMessage = StringUtils.join(resultMessage, winnerNames.get(i), addComma(winnerCount, i));
		}
		System.out.println(StringUtils.join(resultMessage, "(이)가 최종 우승했습니다."));
	}

	private static String addComma(int winnerCount, int now) {
		if (winnerCount - 1 == now) {
			return "";
		}
		return ",";
	}

}

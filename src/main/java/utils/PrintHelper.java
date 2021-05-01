package utils;

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
}

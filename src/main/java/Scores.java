import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Scores {
	private final List<String> scores = new ArrayList<>();

	public Scores() {
		for (int i = 0; i < CarNames.getLength(); i++) {
			scores.add("");
		}
	}

	public void plus(int position) {
		String nowScore = scores.get(position);
		scores.set(position, nowScore + "-");
	}

	public String get(int position) {
		return scores.get(position);
	}

	public void getWinner() {
		List<Integer> scoreCount = new ArrayList<>();
		scores.forEach(score -> scoreCount.add(score.length()));
		int max = getWinnerScore(scoreCount);
		
		scoreCount.stream().filter((count) -> count == max).collect(Collectors.toList()).forEach(System.out::println);

	}

	private int getWinnerScore(List<Integer> scoreCount) {
		return Collections.max(scoreCount);
	}

	// Arrays.asList(scores.forEach(score -> score.length()));

	public void printWinner() {

	}
}

import utils.PrintHelper;

public class Car {
	private String name;
	private int score;

	public Car(String name) {
		this.name = name;
		this.score = 0;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public boolean isWinner(int winnerScore) {
		return score == winnerScore;
	}

	public void play() {
		if (Judgement.judge().isGone()) {
			score++;
		}
	}

	public void printScore() {
		PrintHelper.printScoreStatus(name, score);
	}
}

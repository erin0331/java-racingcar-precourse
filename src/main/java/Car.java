import utils.PrintHelper;

public class Car {
	private String name;
	private int score;
	private boolean isWinner;

	public Car(String name) {
		this.name = name;
		this.score = 0;
		this.isWinner = false;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public boolean isWinner() {
		return isWinner;
	}

	public void setWinner() {
		isWinner = true;
	}

	public void play() {
		if (Judgement.judge().isGone()) {
			score++;
		}
	}

	public void printScoreStatus() {
		PrintHelper.printScoreStatus(name, score);
	}
}

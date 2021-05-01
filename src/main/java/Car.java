public class Car {
	private String name;
	private String score;
	private boolean isWinner;

	public Car(String name) {
		this.name = name;
		this.score = "";
		this.isWinner = false;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score.length();
	}

	public boolean isWinner() {
		return isWinner;
	}

	public void setWinner() {
		isWinner = true;
	}

	public void play() {
		if (Judgement.judge().isGone()) {
			this.score = this.score + "-";
		}
	}

	public String getScoreStatus() {
		return this.name + " : " + this.score;
	}
}

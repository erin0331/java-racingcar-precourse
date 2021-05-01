public class Car {
	private String name;
	private String score;

	public Car(String name) {
		this.name = name;
		this.score = "";
	}

	public void plusScore() {
		this.score = this.score + "-";
	}

	public String getScoreStatus() {
		return this.name + " : " + this.score;
	}
}

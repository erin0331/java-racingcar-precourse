import utils.Validator;

public class Game {

	private final Cars cars;
	private final int roundCount;

	public Game(Cars cars, String roundCount) {
		this.cars = cars;
		this.roundCount = Validator.checkRoundCount(roundCount);
	}

	public void play() {
		for (int i = 0; i < roundCount; i++) {
			cars.play();
			cars.printScore();
		}
	}

}

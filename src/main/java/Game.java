import utils.Validator;

public class Game {

	private final Cars cars;
	private final int roundCount;

	public Game(Cars cars, String roundCount) {
		this.cars = cars;
		this.roundCount = Validator.checkRoundCount(roundCount);
	}
}

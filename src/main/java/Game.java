import utils.PrintHelper;
import utils.Validator;

public class Game {

	private final Cars cars;
	private final int roundCount;

	public Game(Cars cars, String roundCount) {
		this.cars = cars;
		this.roundCount = Validator.getValidRoundCount(roundCount);
	}

	public void play() {
		PrintHelper.printGuidance();
		for (int i = 0; i < roundCount; i++) {
			cars.play();
			cars.printScore();
		}
		printResult();
	}

	private void printResult() {
		PrintHelper.printResult(cars.getWinnerNames());
	}
}

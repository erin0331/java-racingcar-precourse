import utils.PrintHelper;
import utils.Validator;

public class Game {

	private final Cars cars;
	private final int roundCount;
	private final Judgement judgement;

	public Game(Cars cars, String roundCount) {
		this.cars = cars;
		this.roundCount = Validator.getValidRoundCount(roundCount);
		this.judgement = new Judgement();
	}

	public void play() {
		PrintHelper.printGuidance();
		for (int i = 0; i < roundCount; i++) {
			cars.play(judgement);
			cars.printScore();
		}
		printResult();
	}

	private void printResult() {
		PrintHelper.printResult(cars.getWinnerNames());
	}
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utils.PrintHelper;
import utils.Validator;

public class Cars {
	private final List<Car> cars = new ArrayList<>();

	public Cars(String carNames) {
		Validator.getValidCarNames(carNames).forEach(carName ->
			cars.add(new Car(carName)));
	}

	Car getCar(int carOrder) {
		return cars.get(carOrder);
	}

	public void printScore() {
		cars.forEach(Car::printScore);
		PrintHelper.printLine();
	}

	public void play(Judgement judgement) {
		cars.forEach(car -> car.play(judgement.judge()));
	}

	public List<String> getWinnerNames() {
		int winnerScore = getWinnerScore();
		List<String> winnerNames = new ArrayList<>();
		cars.forEach(car -> addWinnerNames(winnerNames, car, winnerScore));
		return winnerNames;
	}

	private int getWinnerScore() {
		List<Integer> scoreList = new ArrayList<>();
		cars.forEach(car -> {
			scoreList.add(car.getScore());
		});
		return Collections.max(scoreList);
	}

	private void addWinnerNames(List<String> winners, Car car, int winnerScore) {
		if (car.isWinner(winnerScore)) {
			winners.add(car.getName());
		}
	}

}

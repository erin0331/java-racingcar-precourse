import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utils.PrintHelper;
import utils.Validator;

public class Cars {
	private final List<Car> cars = new ArrayList<>();

	public Cars(String carNames) {
		Validator.checkCarNames(carNames).forEach(carName ->
			cars.add(new Car(carName)));
	}

	public Car getCar(int carOrder) {
		return cars.get(carOrder);
	}

	public void printScore() {
		cars.forEach(car -> car.printScoreStatus());
		PrintHelper.printLine();
	}

	public void play() {
		cars.forEach(car -> car.play());
	}

	public List<String> getWinnerNames() {
		int winnerScore = getWinnerScore();
		List<String> winnerNames = new ArrayList<>();
		cars.forEach(car -> chooseWinner(winnerNames, car, winnerScore));
		return winnerNames;
	}

	private int getWinnerScore() {
		List<Integer> scoreList = new ArrayList<>();
		cars.forEach(car -> {
			scoreList.add(car.getScore());
		});
		return Collections.max(scoreList);
	}

	private void chooseWinner(List<String> winners, Car car, int winnerScore) {
		if (car.getScore() == winnerScore) {
			car.setWinner();
			winners.add(car.getName());
		}
	}
}

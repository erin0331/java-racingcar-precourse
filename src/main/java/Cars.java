import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utils.Validator;

public class Cars {
	private final List<Car> cars = new ArrayList<>();

	public Cars(String carNames) {
		Validator.checkCarNames(carNames).forEach(carName ->
			cars.add(new Car(carName)));
	}

	public Car getCar(int position) {
		return cars.get(position);
	}

	public void printScore() {
		cars.forEach(car ->
			System.out.println(car.getScoreStatus()));
		System.out.println();
	}

	public void play() {
		cars.forEach(car -> car.play());
	}

	public List<Car> getWinner() {
		int winnerScore = getWinnerScore();
		List<Car> winners = new ArrayList<>();
		cars.forEach(car -> chooseWinner(winners, car, winnerScore));
		return winners;
	}

	private int getWinnerScore() {
		List<Integer> scoreList = new ArrayList<>();
		cars.forEach(car -> {
			scoreList.add(car.getScore());
		});
		return Collections.max(scoreList);
	}

	private void chooseWinner(List<Car> winners, Car car, int winnerScore) {
		if (car.getScore() == winnerScore) {
			car.setWinner();
			winners.add(car);
		}
	}
}

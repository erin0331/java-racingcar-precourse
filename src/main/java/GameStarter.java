import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import utils.PrintHelper;

public class GameStarter {
	private BufferedReader bufferedReader;

	public GameStarter() {
		this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	public static void main(String[] args) {
		GameStarter gameStarter = new GameStarter();
		try {
			gameStarter.start();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void start() throws IOException {
		PrintHelper.printInputCars();
		Cars cars = new Cars(bufferedReader.readLine());
		PrintHelper.printInputRound();
		Game game = new Game(cars, bufferedReader.readLine());
		game.play();
		bufferedReader.close();
	}

}

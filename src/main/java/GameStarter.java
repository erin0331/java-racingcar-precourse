import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameStarter {
	private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {

		GameStarter gameStarter = new GameStarter();
		try {
			gameStarter.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void start() throws IOException {
		System.out.println("자동차 이름 입력");
		new CarNames(bufferedReader.readLine());
		System.out.println("숫자를 입력");
		Game game = new Game(bufferedReader.readLine());
		game.play();
		bufferedReader.close();
	}
}

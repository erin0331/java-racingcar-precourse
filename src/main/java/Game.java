public class Game {
	private int roundCount;
	private final Judgement judgement = new Judgement();
	private final Scores scores = new Scores();

	public Game(String count) {
		try {
			this.roundCount = Integer.parseInt(count);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("라운드는 숫자만 입력 가능합니다.");
		}
		if (this.roundCount < 1) {
			throw new IllegalArgumentException("라운드는 1이상만 입력 가능합니다.");
		}
	}

	public void play() {
		for (int i = 0; i < roundCount; i++) {
			playRound();
		}
		scores.getWinner();
	}

	private void playRound() {
		for (int i = 0; i < CarNames.getLength(); i++) {
			makeScore(i);
		}
		printScore();
	}

	private void makeScore(int position) {
		if (Judgement.judge().isGone()) {
			scores.plus(position);
		}
	}
	
	private void printScore() {
		System.out.println("실행 결과");
		for (int i = 0; i < CarNames.getLength(); i++) {
			System.out.println(CarNames.get(i) + ":" + scores.get(i));
		}
		System.out.println();
	}
}

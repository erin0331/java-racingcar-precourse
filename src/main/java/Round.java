public class Round {
	private int count;

	public Round(String count) {
		try {
			this.count = Integer.parseInt(count);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("라운드는 숫자만 입력 가능합니다.");
		}
		if (this.count < 1) {
			throw new IllegalArgumentException("라운드는 1이상만 입력 가능합니다.");
		}
	}
}

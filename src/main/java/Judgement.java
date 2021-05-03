import constant.MoveStatus;
import utils.RandomGenerator;

public class Judgement {
	private final RandomGenerator randomGenerator = new RandomGenerator();
	private final int MIN_GO_NUMBER = 4;

	public MoveStatus judge() {
		if (isStopped()) {
			return MoveStatus.STOP;
		}
		return MoveStatus.GO;
	}

	private boolean isStopped() {
		return randomGenerator.getNumber() < MIN_GO_NUMBER;
	}
}

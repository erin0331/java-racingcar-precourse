import constant.MoveStatus;
import utils.RandomGenerator;

public class Judgement {
	private static final RandomGenerator randomGenerator = new RandomGenerator();
	private static final int MIN_GO_NUMBER = 4;

	public static MoveStatus judge() {
		if (isStopped()) {
			return MoveStatus.STOP;
		}
		return MoveStatus.GO;
	}

	private static boolean isStopped() {
		return randomGenerator.getNumber() < MIN_GO_NUMBER;
	}
}

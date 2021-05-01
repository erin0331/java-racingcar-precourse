import constant.MoveStatus;

public class Judgement {
	private static final RandomNumber randomNumber = new RandomNumber();

	public static MoveStatus judge() {
		if (isStopped()) {
			return MoveStatus.STOP;
		}
		return MoveStatus.GO;
	}

	private static boolean isStopped() {
		return randomNumber.get() < 4;
	}
}

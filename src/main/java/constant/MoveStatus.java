package constant;

public enum MoveStatus {
	STOP, GO;

	public boolean isGone() {
		return this == GO;
	}
}

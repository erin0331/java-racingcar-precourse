import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

	@Test
	void 라운드_문자_예외발생() {
		Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
			.isThrownBy(() -> {
				Game game = new Game(new Cars("차1,차2"), "가");
			}).withMessageMatching("라운드는 숫자만 입력 가능합니다.");
	}

	@Test
	void 라운드_1미만_예외발생() {
		Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
			.isThrownBy(() -> {
				Game game = new Game(new Cars("차1,차2"), "0");
			}).withMessageMatching("라운드는 1이상만 입력 가능합니다.");
	}
}

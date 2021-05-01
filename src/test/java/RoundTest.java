import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoundTest {

	@Test
	void round_숫자_이외의_입력() {
		Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
			.isThrownBy(() -> {
				Round round = new Round("가");
			}).withMessageMatching("라운드는 숫자만 입력 가능합니다.");

	}

	@Test
	void round_1이하_입력() {
		Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
			.isThrownBy(() -> {
				Round round = new Round("0");
			}).withMessageMatching("라운드는 1이상만 입력 가능합니다.");

	}
}

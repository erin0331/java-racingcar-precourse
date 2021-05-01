import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarNamesTest {

	@Test
	@DisplayName("자동차2대 입력")
	void getCarLength_2() {
		CarNames carNames = new CarNames("자동차,입니다.");
		Assertions.assertThat(carNames.getLength()).isEqualTo(2);
		Assertions.assertThat(carNames.get(0)).isEqualTo("자동차");
	}

	@Test
	@DisplayName("자동차1대 입력: IllegalArgumentException")
	void getCarLength_1() {
		Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
			.isThrownBy(() -> {
				CarNames carName = new CarNames("자동차입니다.");
			}).withMessageMatching("1대 이상의 자동차를 입력 해 주세요.");
	}

}

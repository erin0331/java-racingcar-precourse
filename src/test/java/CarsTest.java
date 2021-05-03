import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarsTest {
	private Cars cars;

	@BeforeEach
	void initCar() {
		cars = new Cars("차1,차2,차3");
	}

	@Test
	void 자동차_3대_추가() {
		Assertions.assertThat(cars.getCar(0).getScore()).isEqualTo(0);
		Assertions.assertThat(cars.getCar(1).getScore()).isEqualTo(0);
		Assertions.assertThat(cars.getCar(2).getScore()).isEqualTo(0);
	}

	@Test
	void 자동차_1대_예외발생() {
		Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
			.isThrownBy(() -> {
				Cars cars = new Cars("차");
			}).withMessageMatching("2대 이상의 자동차를 입력 해 주세요.");
	}

	@Test
	void 자동차이름_5글자_이상_예외발생() {
		Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
			.isThrownBy(() -> {
				Cars cars = new Cars("자동차인가보다,자동차");
			}).withMessageMatching("자동차 이름은 최대 5글자 입니다.");
	}

	@Test
	void 자동차이름_중복_예외발생() {
		Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
			.isThrownBy(() -> {
				Cars cars = new Cars("자동차,자동차");
			}).withMessageMatching("중복된 자동차가 있습니다.");
	}

	@Test
	void 우승자_1명() {
		cars.getCar(0).play();
		Assertions.assertThat(cars.getWinnerNames().size()).isEqualTo(1);
	}

	@Test
	void 우승자_2명() {
		cars.getCar(0).play();
		cars.getCar(1).play();

		Assertions.assertThat(cars.getWinnerNames().size()).isEqualTo(2);
	}
}

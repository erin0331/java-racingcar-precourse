import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import constant.MoveStatus;

public class CarTest {
	Car car;

	@BeforeEach
	void setUp() {
		car = new Car("자동차1");
	}

	@Test
	void 자동차_점수_추가() {
		car.play(MoveStatus.GO);
		Assertions.assertThat(car.getScore()).isEqualTo(1);
	}

	@Test
	void 자동차_승자_true() {
		car.play(MoveStatus.GO);
		Assertions.assertThat(car.isWinner(1)).isTrue();
	}
}

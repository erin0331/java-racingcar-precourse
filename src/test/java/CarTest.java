import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
	@Test
	void 자동차_점수_추가() {
		Car car = new Car("자동차1");
		car.plusScore();
		Assertions.assertThat(car.getScoreStatus()).isEqualTo("자동차1 : -");
	}
}

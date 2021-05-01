import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScoresTest {

	CarNames carNames = new CarNames("테스트, 입니다");

	@Test
	void addScore() {
		Scores scores = new Scores();
		scores.plus(0);
		scores.plus(0);
		Assertions.assertThat(scores.get(0)).isEqualTo("--");
	}

}

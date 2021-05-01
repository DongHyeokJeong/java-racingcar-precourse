import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {
	private Car car;

	@BeforeEach
	void setUp() {
		car = new Car();
	}

	@Test
	public void 자동차_전진() {
		assertThat(car.getPosition()).isEqualTo(0);

		car.move();
		assertThat(car.getPosition()).isEqualTo(1);
	}

	@Test
	public void 자동차_이름부여() {
		car.setName("dong");
		assertThat(car.getName()).isEqualTo("dong");
	}

	@Test
	public void 자동차_이름부여_5글자초과_오류() {
		assertThatThrownBy(() -> {
			car.setName("asdfgh");
		}).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("자동차 이름은 5글자 이상 올 수 없습니다.");
	}
}

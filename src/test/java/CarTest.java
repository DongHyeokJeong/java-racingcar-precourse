import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	public void 자동차_전진() {
		Car car = new Car(0, "dong");
		assertThat(car.getPosition()).isEqualTo(0);

		car.move();
		assertThat(car.getPosition()).isEqualTo(1);
	}

	@Test
	public void 자동차_이름부여() {
		Car car = new Car(0, "dong");
		assertThat(car.getName()).isEqualTo("dong");
	}
}

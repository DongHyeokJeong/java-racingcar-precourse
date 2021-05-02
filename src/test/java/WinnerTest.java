import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class WinnerTest {
	@Test
	public void 우승자_구하기() {
		List<Car> cars = new ArrayList<>();
		Car firstCar = new Car();
		firstCar.setName("one");
		cars.add(firstCar);

		Car secondCar = new Car();
		secondCar.move();
		secondCar.setName("two");
		cars.add(secondCar);

		assertThat(new Winner().getWinner(cars).size()).isEqualTo(1);
	}
}

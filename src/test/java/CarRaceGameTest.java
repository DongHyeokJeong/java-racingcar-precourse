import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarRaceGameTest {
	private CarRaceGame carRaceGame;
	private List<Car> cars;

	@BeforeEach
	void setUp() {
		carRaceGame = new CarRaceGame();
		cars = new ArrayList<>();

		Car firstCar = new Car();
		firstCar.setName("one");
		firstCar.move();

		Car secondCar = new Car();
		secondCar.setName("two");
		secondCar.move();

		cars.add(firstCar);
		cars.add(secondCar);
	}

	@Test
	public void 게임_1회_실행결과() {
		String result = carRaceGame.printPlay(cars);
		String expectedResult = "one : -\ntwo : -\n\n";
		assertThat(expectedResult).isEqualTo(result);
	}

	@Test
	public void 게임_최종_실행결과() {
		String result = carRaceGame.printResult(cars);
		String expectedResult = "one, two가 최종 우승했습니다.";
		assertThat(expectedResult).isEqualTo(result);
	}
}

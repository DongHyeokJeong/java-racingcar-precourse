import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarsTest {
	private Cars cars;
	private Car firstCar;
	private Car secondCar;

	@BeforeEach
	void setUp() {
		cars = new Cars();

		firstCar = new Car();
		firstCar.setName("one");
		secondCar = new Car();
		secondCar.setName("two");

		cars.add(firstCar);
		cars.add(secondCar);
	}

	@Test
	public void 랜덤값에따라_자동차들_이동() {
		List<Integer> randomList = new ArrayList<>();
		randomList.add(3);
		randomList.add(5);

		cars.play(randomList);
		assertThat(firstCar.getPosition()).isEqualTo(0);
		assertThat(secondCar.getPosition()).isEqualTo(1);
	}

	@Test
	public void 자동차_만들기() {
		assertThat(cars.makeCars("one,two")).isEqualTo(2);
	}

	@Test
	public void 자동차_정보_가져오기() {
		assertThat(cars.getCars().size()).isEqualTo(2);
	}

	@Test
	public void 우승자_가져오기() {
		assertThat(cars.getWinner().size()).isEqualTo(2);

		List<Integer> randomList = new ArrayList<>();
		randomList.add(3);
		randomList.add(5);

		cars.play(randomList);
		assertThat(cars.getWinner().size()).isEqualTo(1);
		assertThat(cars.getWinner().get(0).getName()).isEqualTo("two");
	}

	@Test
	public void 우승자_가져오기_4개자동차() {
		cars.makeCars("one,two,three,four");

		List<Integer> randomList = new ArrayList<>();
		randomList.add(3);
		randomList.add(5);
		randomList.add(3);
		randomList.add(5);

		cars.play(randomList);
		assertThat(cars.getWinner().size()).isEqualTo(2);
		assertThat(cars.getWinner().get(0).getName()).isEqualTo("two");
		assertThat(cars.getWinner().get(1).getName()).isEqualTo("four");
	}
}

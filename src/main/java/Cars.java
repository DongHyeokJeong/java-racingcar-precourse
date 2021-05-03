import java.util.ArrayList;
import java.util.List;

public class Cars {
	private final int GO_OR_STOP_STANDARD = 3;
	private List<Car> cars;

	public Cars() {
		this.cars = new ArrayList<>();
	}

	public void add(Car car) {
		cars.add(car);
	}

	public void play(List<Integer> randomList) {
		for (int index = 0; index < cars.size(); index++) {
			Car car = cars.get(index);
			Integer randomValue = randomList.get(index);
			decideMoveOrStop(car, randomValue);
		}
	}

	private void decideMoveOrStop(Car car, Integer randomValue) {
		if ((randomValue > GO_OR_STOP_STANDARD)) {
			car.move();
		}
	}

	public int makeCars(String carNameString) {
		cars = new ArrayList<>();
		String[] carNames = carNameString.split(",");
		for (String carName : carNames) {
			Car newCar = new Car();
			newCar.setName(carName);
			cars.add(newCar);
		}
		return cars.size();
	}

	public List getCars() {
		return this.cars;
	}

	public List<Car> getWinner() {
		return new Winner().getWinner(cars);
	}

	public int getCarNumber() {
		return this.cars.size();
	}
}

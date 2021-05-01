import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Cars {
	private List<Car> cars;

	public Cars() {
		this.cars = new ArrayList<>();
	}

	public void add(Car car) {
		cars.add(car);
	}

	public void play(List<Integer> randomList) {
		for(int index=0; index < cars.size(); index++) {
			Car car = cars.get(index);
			Integer randomValue = randomList.get(index);
			decideMoveOrStop(car, randomValue);
		}
	}

	private void decideMoveOrStop(Car car, Integer randomValue) {
		if ((randomValue > 3)) {
			car.move();
		}
	}

	public int makeCars(String carNameString) {
		cars = new ArrayList<>();
		String[] carNames = carNameString.split(",");
		for(String carName : carNames) {
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
		List<Car> winner = new ArrayList<>();
		int maxValue = 0;
		for(Car car: cars) {
			if (winner.size() == 0) {
				winner.add(car);
				maxValue = car.getPosition();
				break;
			}
			if(car.getPosition() > maxValue) {
				winner = new ArrayList<>();
				winner.add(car);
				maxValue = car.getPosition();
				break;
			}
			if(car.getPosition() == maxValue) {
				winner.add(car);
			}
		}
		return winner;
	}
}

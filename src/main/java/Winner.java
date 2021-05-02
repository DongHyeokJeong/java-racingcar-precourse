import java.util.ArrayList;
import java.util.List;

public class Winner {
	private List<Car> winner;
	private int maxValue;

	public Winner() {
		initWinnerList();
		maxValue = 0;
	}

	public List<Car> getWinner(List<Car> cars) {
		for(Car car: cars) {
			int position = car.getPosition();
			addWinner(car, position);
			renewWinner(car, position);
		}
		return winner;
	}

	private void renewWinner(Car car, int position) {
		if (position > maxValue) {
			initWinnerList();
			winner.add(car);
			maxValue = position;
		}
	}

	private void initWinnerList() {
		winner = new ArrayList<>();
	}

	private void addWinner(Car car, int position) {
		if (position == maxValue) {
			winner.add(car);
		}
	}
}

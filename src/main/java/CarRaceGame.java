import java.util.List;
import java.util.Scanner;

public class CarRaceGame {
	public static void main(String[] args) {
		Cars cars = new Cars();
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		String carNames = inputCarNames();
		System.out.println("시도할 회수는 몇회인가요?");
		int inputNumber = inputNumber();
		System.out.println("\n실행결과");
		System.out.print(playGame(cars, carNames, inputNumber));
		System.out.println(printResult(cars.getWinner()));
	}

	private static int inputNumber() {
		Scanner scanner = new Scanner(System.in);
		if (!scanner.hasNextInt()) {
			throw new IllegalArgumentException("숫자를 입력해주세요.");
		}
		int inputNumber = scanner.nextInt();
		return inputNumber;
	}

	private static String inputCarNames() {
		Scanner scanner = new Scanner(System.in);
		String carNames = scanner.next();
		return carNames;
	}

	private static String playGame(Cars cars, String carNames, int inputNumber) {
		String gameResult = "";
		cars.makeCars(carNames);
		for (int round = 0; round < inputNumber; round++) {
			cars.play(new Random().generateList(cars.getCarNumber()));
			gameResult += printPlay(cars.getCars());
		}
		return gameResult;
	}

	public static String printPlay(List<Car> cars) {
		String playResult = "";
		for (Car car : cars) {
			playResult += car.getName() + " : " + printPosition(car) + "\n";
		}
		return playResult + "\n";
	}

	public static String printPosition(Car car) {
		String positionResult = "";
		for (int num = 0; num < car.getPosition(); num++) {
			positionResult += "-";
		}
		return positionResult;
	}

	public static String printResult(List<Car> winner) {
		String result = "";
		for (int num = 0; num < winner.size(); num++) {
			result += winner.get(num).getName() + addComma(winner.size(), num);
		}
		return result + "가 최종 우승했습니다.";
	}

	private static String addComma(int listSize, int num) {
		if (!(num == listSize - 1)) {
			return ", ";
		}
		return "";
	}
}

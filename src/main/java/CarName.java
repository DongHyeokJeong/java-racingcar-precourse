public class CarName {
	private static final int MAXIMUM_CAR_NUMBER = 5;
	private String carName;

	public String getCarName() {
		return carName;
	}

	public void setName(String carName) {
		if (!validateCarName(carName)) {
			throw new IllegalArgumentException("자동차 이름은 5글자 이상 올 수 없습니다.");
		}
		this.carName = carName;
	}

	public boolean validateCarName(String carName) {
		if (carName.length() > MAXIMUM_CAR_NUMBER) {
			return false;
		}
		return true;
	}
}

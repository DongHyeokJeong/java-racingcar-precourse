public class CarName {
	private static final int MAXIMUM_CAR_NUMBER = 5;
	private String carName;

	public CarName() {
		this.carName = "";
	}

	public String getCarName() {
		return carName;
	}

	public void setName(String carName) {
		this.carName = carName;
	}

	public boolean validateCarName(String carName) {
		if (carName.length() > MAXIMUM_CAR_NUMBER) {
			return false;
		}
		return true;
	}
}

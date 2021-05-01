public class Car {
	private int position;
	private CarName name;

	public Car() {
		this.position = 0;
		this.name = new CarName();
	}

	public int getPosition() {
		return position;
	}

	public void move() {
		this.position++;
	}

	public String getName() {
		return this.name.getCarName();
	}

	public void setName(String name) {
		if (!this.name.validateCarName(name)) {
			throw new IllegalArgumentException("자동차 이름은 5글자 이상 올 수 없습니다.");
		}
		this.name.setName(name);
	}
}

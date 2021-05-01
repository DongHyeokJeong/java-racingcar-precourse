public class Car {
	private int position = 0;
	private CarName name = new CarName();

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
		this.name.setName(name);
	}
}

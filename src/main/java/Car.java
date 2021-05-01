public class Car {
	private int position;
	private String name;

	public Car(int position, String name) {
		this.position = position;
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void move() {
		this.position++;
	}

	public String getName() {
		return name;
	}
}

import java.util.ArrayList;
import java.util.List;

public class Random {
	public int generateValue() {
		return (int)(Math.random() * 9);
	}

	public List<Integer> generateList(int count) {
		List<Integer> randomValueList = new ArrayList<>();
		for (int index = 0; index < count; index++) {
			randomValueList.add(this.generateValue());
		}
		return randomValueList;
	}
}

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RandomTest {
	private Random random;

	@BeforeEach
	public void setup() {
		random = new Random();
	}

	@Test
	public void 랜덤값구하기() {
		assertThat(random.generateValue()).isGreaterThanOrEqualTo(0).isLessThanOrEqualTo(9);
	}

	@Test
	public void 랜덤값리스트구하기() {
		List<Integer> resultList = random.generateList(10);
		assertThat(resultList.size()).isEqualTo(10);
		for(Integer randomValue : resultList) {
			assertThat(randomValue).isGreaterThanOrEqualTo(0).isLessThanOrEqualTo(9);
		}
	}
}

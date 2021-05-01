import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarNameTest {
	private CarName carName;

	@BeforeEach
	void setUp() {
		carName = new CarName();
	}

	@Test
	public void 자동차_이름부여() {
		carName.setName("dong");
		assertThat(carName.getCarName()).isEqualTo("dong");
	}

	@Test
	public void 자동차_이름검증() {
		assertThat(carName.validateCarName("asdfgh")).isEqualTo(false);
		assertThat(carName.validateCarName("asdf")).isEqualTo(true);
	}
}

package org.example.domain;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class PlayerNumberTest {
	@Test
	@DisplayName("유효한 PlayerNumber 생성")
	void testValidPlayerNumber() {
		PlayerNumber playerNumber = new PlayerNumber(Arrays.asList(1, 2, 3));
		assertEquals(Arrays.asList(1, 2, 3), playerNumber.getNumbers());
	}

	@Test
	@DisplayName("유효하지 않은 숫자 범위로 PlayerNumber 생성 시 예외 발생")
	void testNumberOutOfRange() {
		assertThrows(IllegalArgumentException.class, () -> new PlayerNumber(Arrays.asList(0, 1, 2)));
		assertThrows(IllegalArgumentException.class, () -> new PlayerNumber(Arrays.asList(1, 10, 3)));
	}
}

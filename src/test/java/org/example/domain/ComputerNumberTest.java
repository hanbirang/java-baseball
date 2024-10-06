package org.example.domain;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class ComputerNumberTest {
	@Test
	@DisplayName("숫자가 스트라이크인지 확인")
	void testIsStrike() {
		ComputerNumber computerNumber = new ComputerNumber(Arrays.asList(1, 2, 3));
		assertTrue(computerNumber.isStrike(1, 0));
		assertFalse(computerNumber.isStrike(2, 0));
	}

	@Test
	@DisplayName("숫자가 볼인지 확인")
	void testIsBall() {
		ComputerNumber computerNumber = new ComputerNumber(Arrays.asList(1, 2, 3));
		assertTrue(computerNumber.isBall(2, 0));
		assertFalse(computerNumber.isBall(4, 0));
	}
}

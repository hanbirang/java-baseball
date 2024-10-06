package org.example.domain;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameNumberTest {
	@Test
	@DisplayName("유효한 GameNumber 생성 test")
	void testValidGameNumber() {
		GameNumber gameNumber = new GameNumber(Arrays.asList(1, 2, 3));
		assertEquals(Arrays.asList(1, 2, 3), gameNumber.getNumbers());
	}

	@Test
	@DisplayName("빈 리스트로 GameNumber 생성 시 예외 발생")
	void testEmptyGameNumber() {
		assertThrows(IllegalArgumentException.class, () -> new GameNumber(Arrays.asList()));
	}

	@Test
	@DisplayName("잘못된 크기의 리스트로 GameNumber 생성 시 예외 발생")
	void testInvalidSizeGameNumber() {
		assertThrows(IllegalArgumentException.class, () -> new GameNumber(Arrays.asList(1, 2)));
	}

	@Test
	@DisplayName("중복된 숫자로 GameNumber 생성 시 예외 발생")
	void testDuplicateNumbersGameNumber() {
		assertThrows(IllegalArgumentException.class, () -> new GameNumber(Arrays.asList(1, 1, 2)));
	}
}

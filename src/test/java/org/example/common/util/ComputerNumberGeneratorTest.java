package org.example.common.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerNumberGeneratorTest {
	private final ComputerNumberGenerator generator = new ComputerNumberGenerator();
	@Test
	@DisplayName("세 개의 숫자를 반환 테스트")
	void testGenerateComputerNumberSize() {
		List<Integer> computerNumbers = generator.generateComputerNumber();
		assertEquals(3, computerNumbers.size());
	}

	@Test
	@DisplayName("중복되지 않은 숫자를 반환 테스트")
	void testGenerateComputerNumberNoDuplicates() {
		List<Integer> computerNumbers = generator.generateComputerNumber();

		long uniqueCount = computerNumbers.stream().distinct().count();
		assertEquals(3, uniqueCount, "중복된 숫자가 존재합니다.");
	}

	@Test
	@DisplayName("1부터 9 사이의 숫자 반환 테스트")
	void testGenerateComputerNumberInRange() {
		List<Integer> computerNumbers = generator.generateComputerNumber();

		computerNumbers.forEach(number -> {
			assertTrue(number >= 1 && number <= 9, "숫자가 1부터 9 범위를 벗어났습니다.");
		});
	}
}

package org.example.domain;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ResultTest {
	@Test
	@DisplayName("기본 생성자로 Result 초기화")
	void testDefaultResult() {
		Result result = new Result();
		assertEquals(0, result.getBall());
		assertEquals(0, result.getStrike());
	}

	@Test
	@DisplayName("매개변수로 Result 초기화")
	void testCustomResult() {
		Result result = new Result(1, 2);
		assertEquals(1, result.getBall());
		assertEquals(2, result.getStrike());
	}

	@Test
	@DisplayName("스트라이크가 3일 때 isThreeStrike가 true를 반환")
	void testIsThreeStrike() {
		Result result = new Result(0, 3);
		assertTrue(result.isThreeStrike());
	}

	@Test
	@DisplayName("낫싱 반환")
	void testIsNothing() {
		Result result = new Result(0, 0);
		assertTrue(result.isNothing());
	}

	@Test
	@DisplayName("볼 카운트 증가")
	void testIncrementsBall() {
		Result result = new Result(1, 2);
		Result newResult = result.incrementsBall();
		assertEquals(2, newResult.getBall());
		assertEquals(2, newResult.getStrike());
	}

	@Test
	@DisplayName("스트라이크 카운트 증가")
	void testIncrementsStrike() {
		Result result = new Result(1, 2);
		Result newResult = result.incrementsStrike();
		assertEquals(1, newResult.getBall());
		assertEquals(3, newResult.getStrike());
	}
}

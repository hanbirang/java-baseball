package org.example.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.example.domain.ComputerNumber;
import org.example.domain.PlayerNumber;
import org.example.dto.ResultResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ResultServiceTest {
	@Test
	@DisplayName("결과 생성에서 스트라이크와 볼을 올바르게 계산")
	public void testGenerateGameResult() {
		ResultService resultService = new ResultService();

		ComputerNumber computerNumber = new ComputerNumber(List.of(1, 2, 3));
		PlayerNumber playerNumber = new PlayerNumber(List.of(1, 3, 2));

		ResultResponse resultResponse = resultService.generateGameResult(computerNumber, playerNumber);

		assertEquals(2, resultResponse.ball());
		assertEquals(1, resultResponse.strike());
		assertFalse(resultResponse.isWin());
	}

	@Test
	@DisplayName("세 개의 스트라이크가 나오면 승리")
	public void testGenerateGameResultWin() {
		ResultService resultService = new ResultService();

		ComputerNumber computerNumber = new ComputerNumber(List.of(1, 2, 3));
		PlayerNumber playerNumber = new PlayerNumber(List.of(1, 2, 3));

		ResultResponse resultResponse = resultService.generateGameResult(computerNumber, playerNumber);

		assertEquals(0, resultResponse.ball());
		assertEquals(3, resultResponse.strike());
		assertTrue(resultResponse.isWin());
	}
}

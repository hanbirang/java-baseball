package org.example.service;
import static org.example.common.constants.GameConstants.*;
import org.example.domain.ComputerNumber;
import org.example.domain.PlayerNumber;
import org.example.domain.Result;
import org.example.dto.ResultResponse;

public class ResultService {

	public ResultResponse generateGameResult(
		ComputerNumber computerNumber,
		PlayerNumber playerNumber
	) {
		Result result = new Result();

		for (int i = 0; i < BALL_SIZE; i++) {
			int playerNum = playerNumber.getNumbers().get(i);
			result = calculateBallAndStrike(result, computerNumber, playerNum, i);
		}
		boolean isNothing = result.isNothing();
		boolean isWin = result.isThreeStrike();

		return new ResultResponse(
			isNothing,
			isWin,
			result.ball,
			result.strike
		);
	}

	private Result calculateBallAndStrike(
		Result result,
		ComputerNumber computerNumber,
		int playerNumber,
		int index
	) {
		if (computerNumber.isBall(playerNumber, index)) {
			return result.incrementsBall();
		}
		if (computerNumber.isStrike(playerNumber, index)) {
			return result.incrementsStrike();
		}
		return result;
	}
}

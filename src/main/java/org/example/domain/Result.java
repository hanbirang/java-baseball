package org.example.domain;

import java.util.List;

public class Result {
	private int ball;
	private int strike;

	private static final int INIT_VALUE = 0;
	private static final int THREE_STRIKE = 3;

	public Result() {
		this.ball = INIT_VALUE;
		this.strike = INIT_VALUE;
	}

	public boolean isThreeStrike() {
		return this.strike == THREE_STRIKE;
	}

	public boolean isNothing() {
		return this.ball == INIT_VALUE && this.strike == INIT_VALUE;
	}

	public void incrementBallIfMatched(
		ComputerNumber computerNumber,
		int playerNumber,
		int index
	) {
		if (computerNumber.isBall(playerNumber, index)) {
			this.ball++;
		}
	}

	public void incrementStrikeIfMatched(
		ComputerNumber computerNumber,
		int playerNumber,
		int index
	) {
		if (computerNumber.isStrike(playerNumber, index)) {
			this.strike++;
		}
	}
}
package org.example.domain;

import java.util.List;

public class Result {
	public final int ball;
	public final int strike;

	private static final int INIT_VALUE = 0;
	private static final int THREE_STRIKE = 3;

	public Result() {
		this.ball = INIT_VALUE;
		this.strike = INIT_VALUE;
	}

	public Result(final int ball, final int strike) {
		this.ball = ball;
		this.strike = strike;
	}

	public boolean isThreeStrike() {
		return this.strike == THREE_STRIKE;
	}

	public boolean isNothing() {
		return this.ball == INIT_VALUE && this.strike == INIT_VALUE;
	}

	public Result incrementsBall() {
		final int newBall = this.ball + 1;
		return new Result(newBall, this.strike);
	}

	public Result incrementsStrike() {
		final int newStrike = this.strike + 1;
		return new Result(this.ball, newStrike);
	}
}
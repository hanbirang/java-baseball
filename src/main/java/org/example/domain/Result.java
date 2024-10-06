package org.example.domain;

public class Result {
	private final int ball;
	private final int strike;

	private static final int THREE_STRIKE = 3;

	public Result() {
		this(0, 0);
	}

	public Result(final int ball, final int strike) {
		this.ball = ball;
		this.strike = strike;
	}

	public int getBall() {
		return ball;
	}

	public int getStrike() {
		return strike;
	}

	public boolean isThreeStrike() {
		return this.strike == THREE_STRIKE;
	}

	public boolean isNothing() {
		return this.ball == 0 && this.strike == 0;
	}

	public Result incrementsBall() {
		return new Result(this.ball + 1, this.strike);
	}

	public Result incrementsStrike() {
		return new Result(this.ball, this.strike + 1);
	}
}
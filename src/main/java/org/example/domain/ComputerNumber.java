package org.example.domain;

import java.util.List;

public class ComputerNumber {
	private final GameNumber computerNumber;

	public ComputerNumber(List<Integer> computerNumber) {
		this.computerNumber = new GameNumber(computerNumber);
	}

	public boolean isStrike(int playerNumber, int index) {
		List<Integer> computerNumbers = computerNumber.getNumbers();
		return computerNumbers.get(index) == playerNumber;
	}

	public boolean isBall(int playerNumber, int index) {
		List<Integer> computerNumbers = computerNumber.getNumbers();
		return computerNumbers.contains(playerNumber) && !isStrike(playerNumber, index);
	}
}

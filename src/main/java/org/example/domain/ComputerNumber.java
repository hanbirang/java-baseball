package org.example.domain;

import java.util.List;

public class ComputerNumber extends GameNumber {
	public ComputerNumber(List<Integer> numbers) {
		super(numbers);
	}

	public boolean isStrike(int playerNumber, int index) {
		return numbers.get(index) == playerNumber;
	}

	public boolean isBall(int playerNumber, int index) {
		return numbers.contains(playerNumber) && !isStrike(playerNumber, index);
	}
}

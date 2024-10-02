package org.example.domain;

import java.util.List;

public class ComputerNumber {
	private final GameNumber computerNumber;

	public ComputerNumber(List<Integer> computerNumber) {
		this.computerNumber = new GameNumber(computerNumber);
	}
}

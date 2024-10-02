package org.example.domain;

import java.util.List;
import static org.example.common.constants.GameConstants.*;

public class PlayerNumber {
	private final GameNumber playerNumber;

	public PlayerNumber(List<Integer> playerNumber) {
		this.playerNumber = new GameNumber(playerNumber);
		validateNumbersInRange(playerNumber);
	}

	private void validateNumbersInRange(List<Integer> numbers) {
		numbers.forEach(this::validateNumberInRange);
	}

	private void validateNumberInRange(Integer number) {
		if (number < MIN_NUMBER || number > MAX_NUMBER) {
			throw new IllegalArgumentException("각 숫자는 1부터 9 사이여야 합니다.");
		}
	}
}
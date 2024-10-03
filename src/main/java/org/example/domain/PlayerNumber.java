package org.example.domain;

import java.util.List;
import static org.example.common.constants.GameConstants.*;

public class PlayerNumber {
	private final GameNumber playerNumber;

	public PlayerNumber(GameNumber playerNumber) {
		this.playerNumber = playerNumber;
		validateNumbersInRange();
	}

	private void validateNumbersInRange() {
		playerNumber.getNumbers().forEach(this::validateNumberInRange);
	}

	private void validateNumberInRange(Integer number) {
		if (number < MIN_NUMBER || number > MAX_NUMBER) {
			throw new IllegalArgumentException("각 숫자는 1부터 9 사이여야 합니다.");
		}
	}
}
package org.example.domain;

import java.util.List;
import static org.example.common.constants.GameConstants.*;

public class PlayerNumber extends GameNumber{
	public PlayerNumber(List<Integer> numbers) {
		super(numbers);
		validateNumbersInRange();
	}

	private void validateNumbersInRange() {
		numbers.forEach(this::validateNumberInRange);
	}

	private void validateNumberInRange(Integer number) {
		if (number < MIN_NUMBER || number > MAX_NUMBER) {
			throw new IllegalArgumentException("각 숫자는 1부터 9 사이여야 합니다.");
		}
	}
}
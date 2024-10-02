package org.example.domain;

import java.util.HashSet;
import java.util.List;
import static org.example.common.constants.GameConstants.*;

public class GameNumber {
	public List<Integer> numbers;

	public GameNumber(List<Integer> numbers) {
		this.numbers = numbers;
		validateNotEmpty();
		validateSize();
		validateNoDuplicates();
	}

	private void validateNotEmpty() {
		if (numbers == null || numbers.isEmpty()) {
			throw new IllegalArgumentException("숫자를 입력하세요.");
		}
	}

	private void validateSize() {
		if (numbers.size() < BALL_SIZE) {
			throw new IllegalArgumentException("세 개의 숫자를 입력해주세요.");
		}
	}

	private void validateNoDuplicates() {
		if (new HashSet<>(numbers).size() != numbers.size()) {
			throw new IllegalArgumentException("중복된 숫자가 있습니다.");
		}
	}
}
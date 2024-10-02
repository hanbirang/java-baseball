package org.example.common.util;

import static org.example.common.constants.GameConstants.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.example.domain.GameNumber;

public class ComputerNumberGenerator {
	public GameNumber generateComputerNumber() {
		List<Integer> fullNumberRange = new ArrayList<>();

		for (int i=MIN_NUMBER; i<=MAX_NUMBER; i++) {
			fullNumberRange.add(i);
		}

		Collections.shuffle(fullNumberRange);
		List<Integer> selectedNumbers = fullNumberRange.subList(START_INDEX, BALL_SIZE);
		List<Integer> computerNumbers = List.copyOf(selectedNumbers);

		return new GameNumber(computerNumbers);
	}
}

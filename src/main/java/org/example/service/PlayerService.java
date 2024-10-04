package org.example.service;
import static org.example.common.constants.GameConstants.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.example.common.util.MessagePrinter;
import org.example.domain.PlayerNumber;

public class PlayerService {
	private static final Scanner scanner = new Scanner(System.in);
	private final MessagePrinter messagePrinter;

	public PlayerService(MessagePrinter messagePrinter) {
		this.messagePrinter = messagePrinter;
	}

	public int getMenuInput() {
		messagePrinter.printMenuMessage();
		while(!scanner.hasNextInt()) {
			System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
			scanner.next();
		}
		return scanner.nextInt();
	}

	public PlayerNumber getPlayerNumber() {
		while (true) {
			try {
				messagePrinter.printNumberInputMessage();
				String input = scanner.nextLine().trim();

				List<Integer> playerNumbers = parseInputToIntegerList(input);
				return new PlayerNumber(playerNumbers);
			} catch (IllegalArgumentException e) {
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	private List<Integer> parseInputToIntegerList(String input) {
		if (input.length() != BALL_SIZE) {
			throw new IllegalArgumentException("세 개의 숫자를 입력해주세요.");
		}

		List<Integer> numbers = new ArrayList<Integer>();
		for (char c: input.toCharArray()) {
			if (!Character.isDigit(c)) {
				throw new IllegalArgumentException("숫자만 입력해주세요.");
			}
			numbers.add(Character.getNumericValue(c));
		}
		return numbers;
	}
}

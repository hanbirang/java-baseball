package org.example.service;

import java.util.Scanner;

import org.example.common.util.ComputerNumberGenerator;
import org.example.common.util.MessagePrinter;
import org.example.domain.ComputerNumber;
import org.example.domain.PlayerNumber;
import org.example.domain.Result;
import org.example.dto.ResultResponse;

public class GameService {
	private final ComputerNumberGenerator computerNumberGenerator;
	private final MessagePrinter messagePrinter;
	private static final Scanner scanner = new Scanner(System.in);

	public GameService(
		ComputerNumberGenerator computerNumberGenerator,
		MessagePrinter messagePrinter
	) {
		this.computerNumberGenerator = computerNumberGenerator;
		this.messagePrinter = messagePrinter;
	}
	public void progressGame() {
		while (true) {
			messagePrinter.printMenuMessage();
			int choice = scanner.nextInt();

			if (choice == 9) {
				messagePrinter.printEndMessage();
				break;
			} else if (choice == 1) {
				playGame(scanner);
			} else {
				System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
			}
		}
	}

	private void startGame() {
		messagePrinter.printStartMessage();
		ComputerNumber computerNumber = new ComputerNumber(computerNumberGenerator.generateComputerNumber());
	}

	private void playGame(Scanner scanner) {
		startGame();
	}
}

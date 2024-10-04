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
	private final PlayerService	playerService;
	private final ResultService resultService;

	public GameService(
		ComputerNumberGenerator computerNumberGenerator,
		MessagePrinter messagePrinter,
		PlayerService playerService,
		ResultService resultService
	) {
		this.computerNumberGenerator = computerNumberGenerator;
		this.messagePrinter = messagePrinter;
		this.playerService = playerService;
		this.resultService = resultService;
	}

	public void progressGame() {
		while (true) {
			int choice = playerService.getMenuInput();

			if (choice == 9) {
				messagePrinter.printEndMessage();
				break;
			} else if (choice == 1) {
				playGame();
			} else {
				System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
			}
		}
	}

	private void playGame() {
		messagePrinter.printStartMessage();
		ComputerNumber computerNumber = new ComputerNumber(
			computerNumberGenerator.generateComputerNumber()
		);

		boolean isWin = false;
		while (!isWin) {
			PlayerNumber playerNumber = playerService.getPlayerNumber();
			ResultResponse resultResponse = resultService.generateGameResult(
				computerNumber,
				playerNumber
			);

			messagePrinter.printResultMessage(resultResponse);

			if (resultResponse.isWin()) {
				messagePrinter.printWinMessage();
				isWin = true;
			}
		}
	}
}

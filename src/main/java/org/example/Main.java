package org.example;

import org.example.common.util.ComputerNumberGenerator;
import org.example.controller.GameController;
import org.example.common.util.MessagePrinter;
import org.example.service.GameService;
import org.example.service.PlayerService;
import org.example.service.ResultService;

public class Main {
	public static void main(String[] args) {
		MessagePrinter messagePrinter = new MessagePrinter();
		ComputerNumberGenerator computerNumberGenerator = new ComputerNumberGenerator();
		PlayerService playerService = new PlayerService(messagePrinter);
		ResultService resultService = new ResultService();

		GameService gameService = new GameService(
			computerNumberGenerator,
			messagePrinter,
			playerService,
			resultService
		);

		GameController gameController = new GameController(gameService);
		gameController.startGame();
	}
}
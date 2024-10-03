package org.example.service;

import org.example.common.util.ComputerNumberGenerator;
import org.example.common.util.MessagePrinter;
import org.example.domain.ComputerNumber;
import org.example.domain.PlayerNumber;
import org.example.domain.Result;
import org.example.dto.ResultResponse;

public class GameService {
	private final ComputerNumberGenerator computerNumberGenerator;
	private final MessagePrinter messagePrinter;
	private final ResultService resultService;
	private ComputerNumber computerNumber;

	public GameService(
		ComputerNumberGenerator computerNumberGenerator,
		MessagePrinter messagePrinter,
		ResultService resultService
	) {
		this.computerNumberGenerator = computerNumberGenerator;
		this.messagePrinter = messagePrinter;
		this.resultService = resultService;
	}

	public void startGame() {
		messagePrinter.printStartMessage();
		computerNumber = new ComputerNumber(computerNumberGenerator.generateComputerNumber());
	}
}

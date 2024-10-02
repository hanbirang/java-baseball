package org.example;

import org.example.controller.GameController;
import org.example.common.util.MessagePrinter;

public class Main {
	private static final MessagePrinter messagePrinter = new MessagePrinter();
	public static void main(String[] args) {
		GameController gameController = new GameController(
			messagePrinter
		);
	}
}
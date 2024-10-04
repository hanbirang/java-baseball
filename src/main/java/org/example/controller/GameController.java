package org.example.controller;

import org.example.service.GameService;

public class GameController {
	private final GameService gameService;

	public GameController(GameService gameService) {
		this.gameService = gameService;
	}

	public void startGame() {
		gameService.progressGame();
	}
}

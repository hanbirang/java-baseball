package org.example.dto;

public record ResultResponse(
	boolean isNothing,
	boolean isWin,
	int strike,
	int ball
) {
}

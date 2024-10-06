package org.example.dto;

public record ResultResponse(
	boolean isNothing,
	boolean isWin,
	int ball,
	int strike
) {
}

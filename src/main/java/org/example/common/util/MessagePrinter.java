package org.example.common.util;

import org.example.dto.ResultResponse;

public class MessagePrinter {
	public void printMenuMessage() {
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 9를 입력하세요.");
	}

	public void printStartMessage() {
		System.out.println("컴퓨터가 숫자를 뽑았습니다.");
	}

	public void printNumberInputMessage() {
		System.out.println("숫자를 입력해주세요: ");
	}

	public void printResultMessage(ResultResponse resultResponse) {
		if (resultResponse.isNothing()) {
			System.out.println("낫싱");
			return;
		}

		StringBuilder resultMessage = new StringBuilder();
		if (resultResponse.ball() > 0) {
			resultMessage.append(resultResponse.ball()).append(" 볼 ");
		}

		if (resultResponse.strike() > 0) {
			resultMessage.append(resultResponse.strike()).append(" 스트라이크");
		}

		System.out.println(resultMessage.toString().trim());
	}

	public void printWinMessage() {
		System.out.println("3개의 숫자를 모두 맞히셨습니다.");
		System.out.println("-------게임 종료-------");
	}

	public void printEndMessage() {
		System.out.println("애플리케이션이 종료되었습니다.");
	}
}

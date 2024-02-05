package ch09.resolve14;

import java.util.Scanner;

public class Exit implements IQuestionAnswer {
	// Exit 클래스의 목적은 빠져나가기 위한 클래스 구현
	@Override
	public void question() {
		String question = "4. Exit";
		
		System.out.println(question);
	}

	@Override
	public void answer(Scanner sc) {
		
	}

	@Override
	public boolean isRun() {
		return false;
	}

}

package ch09.resolve14;

import java.util.Scanner;

import ch09.resolve14.question03.BaseBallMenu;
import ch09.resolve14.question03.DecisionBall;
import ch09.resolve14.question03.GeneratorThreeNum;

public class Answer3 implements IQuestionAnswer {

	@Override
	public void question() {
		String question = "3. 삼진아웃게임을 만듭니다\n"
				+ "두 사람중에 한 사람이 0~9까지 3개의 숫자중 중복없이 임의의 숫자를 선택합니다\n"
				+ "예를 들어 3 1 9를 선택했다면\n"
				+ "다른 한사람이 3개의 숫자를 맞추고 결과를 응답받습니다\n"
				+ "같은 숫자 동일한 자리일 경우 1스트라이크\n"
				+ "같은 숫자 다른 자리일 경우 1볼입니다\n"
				+ "세자리 숫자 모두 자리까지 일치할 경우는 삼진아웃!!으로 처리합니다\n"
				+ "\n"
				+ "클래스를 구현하세요\n"
				+ "GeneratorThreeNum // 난수 3개를 생성하는 역할\n"
				+ "BaseBallMenu      // 메뉴를 담당하는 역할\n"
				+ "DecisionBall      // 스트라이크, 볼을 판단하는 역할\n"
				+ "BaseBallMain	  // main메서드를 실행하는 역할"
				+ "\r\n\r\n";
		System.out.println(question);
	}

	@Override
	public void answer(Scanner sc) {
		sc.nextInt();
		System.out.println("--------- 삼진아웃 게임을 시작합니다 ~.~ ---------");
		
		// 컴퓨터의 중복되지 않은 3개의 숫자를 생성
		int[] comArr = GeneratorThreeNum.getRandomNum();
		
		boolean isRun = true;
		while(isRun) {
			// 사용자의 3개 숫자 입력
			int[] userArr = new int[3];
			BaseBallMenu.printOrder(1);
			userArr[0] = BaseBallMenu.getUserNum();
			BaseBallMenu.printOrder(2);
			userArr[1] = BaseBallMenu.getUserNum();
			BaseBallMenu.printOrder(3);
			userArr[2] = BaseBallMenu.getUserNum();
			
			// 결과판단
			DecisionBall.decisionBall(comArr, userArr);
		}
		System.out.println("스으으으투롸이크~!");
	}

	@Override
	public boolean isRun() {
		return true;
	}
	
}

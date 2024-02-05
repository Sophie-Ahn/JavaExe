package ch09.resolve14;

import java.util.Scanner;

import ch09.resolve14.question02.ITablet;
import ch09.resolve14.question02.factory01.LenovoTablet;
import ch09.resolve14.question02.factory01.LgTablet;
import ch09.resolve14.question02.factory01.SamsungTablet;
import ch09.resolve14.question02.order01.TabletTester;
import ch09.resolve14.resolve2.Samsung;
import ch09.resolve14.resolve2.TabletMain;

public class Answer2 implements IQuestionAnswer{

	@Override
	public void question() {
		String question = "2. ITablet 인터페이스를 만드세요.\n"
				+ "   아래 메서드를 멤버로 추가하세요.\n"
				+ "   void movie();\n"
				+ "   void music();\n"
				+ "   void readBook();\n"
				+ "   \n"
				+ "   ITablet를 상속받은 삼성, 소니, LG는 Tablet을 구현클래스로 만들고\n"
				+ "   OEM을 의뢰한 비트캠프는 TabletTester를 생성합니다.\n"
				+ "   이 클래스들이 완성되면 TabletMain에서 테스트를 진행하세요."
				+ "\r\n\r\n";
		System.out.println(question);
	}

	@Override
	public void answer(Scanner sc) {
		sc.nextInt();
		
		TabletTester tabletTester = new TabletTester();
		ITablet[] tabletArr = new ITablet[] {
				new SamsungTablet(),
				new LgTablet(),
				new LenovoTablet()
		};
		
		int[] score = new int[tabletArr.length];
		
		for (int i = 0; i < tabletArr.length; i++) {
			// DI(Dependency Injection): 의존성 주입
			// Ioc(Inversion of Control): 역제어
			
			tabletTester.setTablet(tabletArr[i]); // 결국 제어하는건 carArr가 제어함
			
			int movie = 0, music = 0, readBook = 0;
			try {
				movie = tabletTester.movieTest();
				System.out.printf("---OnOff 테스트 점수는 %d입니다\n", score[i]);
				music = tabletTester.musicTest();
				System.out.printf("---Speed 테스트 점수는 %d입니다\n", score[i]);
				readBook = tabletTester.readBookTest();
				System.out.printf("---Break 테스트 점수는 %d입니다\n", score[i]);
				
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			score[i] = movie + music + readBook;
			
			System.out.printf("===>전체 테스트 점수는 %d입니다\n", score[i]);
			System.out.println("----------------------------");
		}
		
		// 제일 큰 점수를 알려줌
		int max = score[0];
		int maxIdx = 0;
		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
				maxIdx = i;
			}
		}
		
		System.out.printf("가장 높은 점수를 받은 차는 %d번째 차이고 점수는 %d입니다.", maxIdx+1, max);
		System.out.println(tabletArr[maxIdx+1].getClass().getName());
		
		System.out.println("2번 문제 실행");
	}
	
	@Override
	public boolean isRun() {
		return true;
	}

}

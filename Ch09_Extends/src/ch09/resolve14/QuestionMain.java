package ch09.resolve14;

import java.util.Scanner;

public class QuestionMain {
	IQuestionAnswer[] qaArr = {
			new Answer1(),
			new Answer2(),
			new Answer3(),
			new Exit()
	};
	
	public int getSelectMenu(Scanner sc) {
		// static이 없어 객체를 생성하고 메모리에 올라갈 수 있음
		System.out.print("\n\n문제 번호 선택>>");
		int num = sc.nextInt();
		
		return num;
	}
	
	public void printQuestion() {
		for(int i = 0; i < qaArr.length; i++) {
			qaArr[i].question();
		}
	}
	
	
	public static void main(String[] args) {
		// main은 static이 있으니까 메모리에 먼저 올라감
		QuestionMain qm = new QuestionMain();
		Scanner sc = new Scanner(System.in);
		
		boolean isRun = true;
		while(isRun) {
			qm.printQuestion();
			int sel = qm.getSelectMenu(sc);
			
			if(sel >= 1 && sel <= qm.qaArr.length) {
				// 인덱스는 입력값보다 1 작으므로
				IQuestionAnswer iqa = qm.qaArr[sel - 1];
				iqa.answer(sc);
				isRun = iqa.isRun();
			} else {
				System.out.println("번호 잘못 선택");
			}
		}
		System.out.println("프로그램종료~");
		
		sc.close();
	}
}

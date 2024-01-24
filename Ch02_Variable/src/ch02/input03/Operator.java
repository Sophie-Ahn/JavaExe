package ch02.input03;

import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		int result = 0;
		int num0 = 0, num1 = 0;
		
		// jdk에서 제공해주는 클래스이고 키보드 입력을 받을 때 사용
		Scanner input = new Scanner(System.in);
		System.out.println("더하기 연산을 합니다.");
		System.out.print("첫 번째 숫자 입력: ");
		num0 = input.nextInt();
		
		System.out.print("두 번째 숫자 입력: ");
		num1 = input.nextInt();
		
		result = num0 + num1;
		System.out.println("결과는 " + result);
		
		input.close(); // 키보드와 연결을 닫는다.
	}
}

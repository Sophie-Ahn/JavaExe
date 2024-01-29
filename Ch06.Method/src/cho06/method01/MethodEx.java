package cho06.method01;

import java.util.Scanner;

// 메서드를 만들기 전 코드
public class MethodEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력: ");
		int num0 = sc.nextInt();
		
		System.out.print("두 번째 정수 입력: ");
		int num1 = sc.nextInt();
		
		System.out.print("연산자 입력: ");
		String op = sc.next();
		
		int result = 0; // 결과값 저장 변수
		
		switch(op) {
			case "+":
				result = num0 + num1;
				break;
			case "-":
				result = num0 - num1;
				break;
			case "*":
				result = num0 * num1;
				break;
			case "/":
				result = num0 / num1;
				break;
			case "%":
				result = num0 % num1;
				break;
			default:
				System.out.println("연산불가");
		}
		System.out.println("결과값은 " + result);
	}
}

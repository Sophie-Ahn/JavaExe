package cho03.control02;

import java.util.Scanner;

public class IfEx {
	public static void main(String[] args) {
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~100 점수 입력 : ");
		score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A학점");
		} else {
			System.out.println("A학점이 아닙니다.");
		}
		sc.close();
	}
}

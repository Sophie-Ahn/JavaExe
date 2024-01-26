package ch03.for10;

import java.util.Scanner;

public class Resolve3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 세개를 입력하세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		boolean isTriangle = ((a + b) > c)
				? (isTriangle = ((a + c) > b) ? (isTriangle = ((b + c) > a) ? true : false) : false)
				: false;

		if (isTriangle == true) {
			System.out.println("삼각형");
		} else {
			System.out.println("삼각형아님");
		}
		
		
		// 선생님풀이
//		boolean bTriangle = false;
//		if (a + b > c && a + c > b && b + c > a) {
//			bTriangle = true;
//			System.out.println("삼각형");
//		} else {
//			System.out.println("삼각형 아님");
//		}
		
	}
}

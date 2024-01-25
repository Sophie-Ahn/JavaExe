package ch03.for10;

import java.util.Scanner;

public class Resolve12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력허세요: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.println("감사합니다.");
		}
	}
}

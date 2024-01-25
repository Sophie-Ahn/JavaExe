package ch03.for10;

import java.util.Scanner;

public class Resolve13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수를 입력하세요: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println(i * 3);
		}
	}
}

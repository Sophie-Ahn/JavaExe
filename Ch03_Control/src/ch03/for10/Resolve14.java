package ch03.for10;

import java.util.Scanner;

public class Resolve14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + (i * num));
		}
	}
}

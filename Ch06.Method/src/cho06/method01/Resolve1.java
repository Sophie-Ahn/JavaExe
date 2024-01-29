package cho06.method01;

import java.util.Scanner;

public class Resolve1 {
	public static void calc (int num0, int num1) {
		
		if (num0 > num1) {
			System.out.println("최소값: " + num1 + " 최대값: " + num0);
		} else {
			System.out.println("최소값: " + num0 + " 최대값: " + num1);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번 정수 입력: ");
		int num0 = sc.nextInt();
		
		System.out.print("2번 정수 입력: ");
		int num1 = sc.nextInt();
		
		
		calc(num0, num1);
		
	}
}

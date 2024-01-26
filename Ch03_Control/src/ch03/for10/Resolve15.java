package ch03.for10;

import java.util.Scanner;

public class Resolve15 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int sum = 0;
		while (true) {
			int num = sc.nextInt();			
			if (num == 0) {
				break;
			}
			sum += num;
		}
		System.out.println(sum);
	}
}

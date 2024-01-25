package ch03.for10;

import java.util.Scanner;

public class Resolve2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1-99입력: ");
		int num = sc.nextInt();
		int cnt = 0;
		
		for (int i = 0; num > 0; i++) {
			int rest = num % 10;
			if (rest % 3 == 0 && rest != 0) {
				cnt++;
			}
			
			num /= 10;
		}
		if (cnt > 0) {
			System.out.print("박수");
		}
		for (int i = 0; i < cnt; i++) {
			System.out.print("짝");
		}
		
	}
}

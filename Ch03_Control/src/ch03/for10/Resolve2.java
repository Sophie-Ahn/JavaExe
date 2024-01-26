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
		
		
		
		// 선생님풀이
//		int n10 = num / 10;
//		int n1 = num % 10;
//		if (n10 == 3 || n10 == 6 || n10 == 9) {
//			cnt++;
//		}
//		if (n1 == 3 || n1 == 6 || n1 == 9) {
//			cnt++;
//		}
//		
//		if (cnt == 1) {
//			System.out.println("박수짝");
//		} else if (cnt == 2) {
//			System.out.println("박수짝짝");
//		}
		
		
	}
}

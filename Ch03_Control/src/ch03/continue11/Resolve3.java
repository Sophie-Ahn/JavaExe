package ch03.continue11;

import java.util.Scanner;

public class Resolve3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-----------------------------");
		
		int num = 0;
		int menu = 0;
		while(true) {
			System.out.print("선택: ");
			menu = sc.nextInt();
			if (menu == 1) {				
				System.out.print("예금액>");
				num += sc.nextInt();
			} else if (menu == 2) {
				System.out.print("출금액>");
				num -= sc.nextInt();
			} else if (menu == 3) {
				System.out.println("잔고>" + num);
			} else if (menu == 4) {
				System.out.println("종료");
				break;
			}
		}
	}
}

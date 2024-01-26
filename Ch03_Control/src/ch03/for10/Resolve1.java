package ch03.for10;

import java.util.Scanner;

public class Resolve1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입금한 돈: ");
		int num = sc.nextInt(); // 76420
		
		int cash_50000 = num / 50000; // 1
		num = num - (cash_50000 * 50000);
		int cash_10000 = num / 10000; // 2
		num = num - (cash_10000 * 10000);
		int cash_5000 = num / 5000; // 1
		num = num - (cash_5000 * 5000);
		int cash_1000 = num / 1000; // 1
		num = num - (cash_1000 * 1000);
		int cash_500 = num / 500; // 0
		num = num - (cash_500 * 500);
		int cash_100 = num / 100; // 4
		num = num - (cash_100 * 100);
		int cash_50 = num / 50; // 0
		num = num - (cash_50 * 50);
		int cash_10 = num / 10; // 2
		num = num - (cash_10 * 10);
		
		if (cash_50000 > 0) {
			System.out.print("오만원 " + cash_50000 + "개 ");
		}
		if (cash_10000 > 0) {
			System.out.print("만원 " + cash_10000 + "개 ");
		}
		if (cash_5000 > 0) {
			System.out.print("오천원" + cash_5000 + "개 ");
		}
		if (cash_1000 > 0) {
			System.out.print("천원" + cash_1000 + "개 ");
		}
		if (cash_500 > 0) {
			System.out.print("오백원" + cash_500 + "개 ");
		}
		if (cash_100 > 0) {
			System.out.print("백원" + cash_100 + "개 ");
		}
		if (cash_50 > 0) {
			System.out.print("오십원" + cash_50 + "개 ");
		}
		if (cash_10 > 0) {
			System.out.print("십원" + cash_10 + "개 ");
		}
		
		
		
		
		// 선생님풀이
//		int money = 0;
//		
//		System.out.println("입금");
//		money = sc.nextInt();
//		int m50000 = money/50000;
//		money = money % 50000;
//		int m10000 = money/10000;
//		money = money % 10000;
//		int m5000 = money/5000;
//		money = money % 5000;
//		int m1000 = money/1000;
//		money = money % 1000;
//		int m500 = money/500;
//		money = money % 500;
//		int m100 = money/100;
//		money = money % 100;
//		int m50 = money/50;
//		money = money % 50;
//		int m10 = money/10;
//		money = money % 10;
//		int m5 = money/5;
//		money = money % 5;
//		int m1 = money/1;
//		money = money % 1;
//		
//		System.out.println("오만원 " + m50000 + "개 "
//				+ "만원 " + m10000 + "개 "
//				+ "오천원 " + m5000 + "개 "
//				+ "천원 " + m1000 + "개 "
//				+ "오백원 " + m500 + "개 "
//				+ "백원 " + m100 + "개 "
//				+ "오십원 " + m50 + "개 "
//				+ "십원 " + m10 + "개 "
//				+ "오원 " + m5 + "개 "
//				+ "일원 " + m1 + "개 ");
//		
//		sc.close();
		
	}
}

package ch05.arrayEx01;

import java.util.Scanner;

public class NeedToArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * */
		System.out.print("1번째 학생 국어점수 입력: ");
		int kor0 = sc.nextInt();
		System.out.print("2번째 학생 국어점수 입력: ");
		int kor1 = sc.nextInt();
		System.out.print("3번째 학생 국어점수 입력: ");
		int kor2 = sc.nextInt();
		
		int total = kor0 + kor1 + kor2;
		double avg = (double) total / 3;
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.printf("평균: %.2f\n", avg);
	}
}

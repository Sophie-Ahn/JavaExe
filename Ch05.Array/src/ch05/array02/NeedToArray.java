package ch05.array02;

import java.util.Scanner;

public class NeedToArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] kor = new int[5];
		
		// 3명의 국어점수 입력
		System.out.print("1번째 학생 국어점수 입력: ");
		kor[0] = sc.nextInt();
		System.out.print("2번째 학생 국어점수 입력: ");
		kor[1] = sc.nextInt();
		System.out.print("3번째 학생 국어점수 입력: ");
		kor[2] = sc.nextInt();
		
		int total = 0;
		double avg = 0.;
		for (int i = 0; i < kor.length; i++) {
			total += kor[i];
		}
		avg = total / kor.length;
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
	}
}

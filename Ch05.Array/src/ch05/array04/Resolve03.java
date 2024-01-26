package ch05.array04;

import java.util.Scanner;

public class Resolve03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[7];
		int total = 0;
		
		System.out.println("7명 학생의 학점을 입력하세요.");
		for (int i = 0; i < 7; i++) {			
			score[i] = sc.nextInt();
			total += score[i];
		}
		
		double avg = (double) total / score.length;
		System.out.println("총점: " + total + " 평균: " + avg);
	
	}
}

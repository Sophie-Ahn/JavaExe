package ch05.array04;

import java.util.Scanner;

public class Resolve05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[10];
		int total = 0;
		System.out.println("10개 정수입력: ");
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			total += score[i]; 
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]+ ", ");
		}
		System.out.print("총합: " + total)
	}
}

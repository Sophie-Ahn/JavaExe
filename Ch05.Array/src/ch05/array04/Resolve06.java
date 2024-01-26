package ch05.array04;

import java.util.Scanner;

public class Resolve06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];
		int[] score = new int[5];
		
		for (int i = 0; i < names.length; i++) {
			System.out.print("학생 이름: ");
			names[i] = sc.next();
			
			System.out.print("점수: ");
			score[i] = sc.nextInt();
		}
		
		for (int i = 0; i < names.length; i++) {
			if (score[i] >= 90) {
				System.out.println("이름: " + names[i] + ", 학점: A");
			} else if (score[i] >= 80) {
				System.out.println("이름: " + names[i] + ", 학점: B");
			} else if (score[i] >= 70) {
				System.out.println("이름: " + names[i] + ", 학점: C");
			} else if (score[i] >= 60) {
				System.out.println("이름: " + names[i] + ", 학점: D");
			} else if (score[i] < 60) {
				System.out.println("이름: " + names[i] + ", 학점: F");
			}
			
		}
		
		
	
	}
}

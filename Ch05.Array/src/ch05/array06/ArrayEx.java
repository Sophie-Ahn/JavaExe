package ch05.array06;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		int[] scores = {100, 80, 95, 67, 70};
		int[] score1 = scores;
		int[] score2 = score1;
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(score1));
		System.out.println(Arrays.toString(score2));
		
		System.out.println(scores);
		System.out.println(score1);
		System.out.println(score2);
		
		// 깊은 복사
		int[] scores4 = Arrays.copyOf(scores, scores.length);
		System.out.println(scores);
		System.out.println(scores4);
	}
}

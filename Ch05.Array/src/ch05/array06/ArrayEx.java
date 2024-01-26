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
	}
}

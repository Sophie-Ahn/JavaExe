package ch05.array08;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		// arr은 1차열 배열을 가진 3개의 참조변수배열을 가진다
		int[][] arr = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[3];
		arr[2] = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = i * 3 + j;
			}
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		for(int[] temp : arr) {
			System.out.println(Arrays.toString(temp));
		}
		
	}
}

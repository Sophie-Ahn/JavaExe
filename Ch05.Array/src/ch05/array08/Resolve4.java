package ch05.array08;

import java.util.Arrays;

public class Resolve4 {
	public static void main(String[] args) {
		int[] arr = {7, 100, 20, 4, 66};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {
					int num = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = num;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
